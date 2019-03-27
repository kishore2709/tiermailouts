package tiermailgen.tiermailgen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tiermailgen.tiermailgen.dao.impl.AppTransAssociationDaoImpl;
import tiermailgen.tiermailgen.dao.impl.AppTransactionsDaoImpl;
import tiermailgen.tiermailgen.dao.impl.ApptransRegRelDaoImpl;
import tiermailgen.tiermailgen.dao.impl.LedgerDaoImpl;
import tiermailgen.tiermailgen.dao.impl.RegistrationItemsDaoImpl;
import tiermailgen.tiermailgen.dao.impl.TierMailoutsDaoImpl;
import tiermailgen.tiermailgen.model.AppTransAssociation;
import tiermailgen.tiermailgen.model.AppTransactions;
import tiermailgen.tiermailgen.model.ApptransRegRel;
import tiermailgen.tiermailgen.model.Ledger;
import tiermailgen.tiermailgen.model.RegistrationItems;
import tiermailgen.tiermailgen.model.TierMailouts;

public class Test {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	public static String CreateModifiedBy="12345";
	public static Ledger createLedger(AppTransactions app,int companyUid) {
		Ledger led= new Ledger();
        led.setLedgerActionTypeUid(2);
        led.setCompanyUid(companyUid);
        led.setAppTransactions(app);
        led.setAmount(new BigDecimal(0.00));
        led.setActiveFlag('Y');
        led.setCreateModifiedBy(CreateModifiedBy);
        led.setCreateModifiedDate(new Date());
        led.setCreationDate(new Date());
		return led;
	}
	public static ApptransRegRel createApptransRegRel(AppTransactions app,RegistrationItems ri) {
		
		
		ApptransRegRel atr = new ApptransRegRel();
    

        	  atr.setAppRegItemStatusUid(4);
  	        atr.setRegItemUid(ri.getRegItemUid());
  	        atr.setRequestActionsUid(57);
  	        atr.setDecisionActionUid(58);
  	        atr.setFulFilledFlag(null);
  	        atr.setRegItemAmount(new BigDecimal(0.00));
  	        atr.setCalulatedExpiration(ri.getExpirationDate());
  	        atr.setActionRequestedDate(new Date());
  	        atr.setActionRequestedBy(CreateModifiedBy);
  	        atr.setCreateModifiedBy(CreateModifiedBy);
  	        atr.setCreateModifiedDate(new Date());
  	        atr.setAppTransactions(app);
  	        
		return atr;
		
	}
	public static AppTransAssociation createAppTransAssociation(AppTransactions app,int appno) {
		 AppTransAssociation ata = new AppTransAssociation();
	        ata.setApplicationUid(appno);
	        ata.setAppTransactions(app);
	        ata.setCreateModifiedBy(CreateModifiedBy);
	        ata.setCreateModifiedDate(new Date());
		
		return ata;
		
	}
	public static AppTransactions createAppTxns(int companyUid) {
		   AppTransactions app =new AppTransactions();
	        app.setAppTransStatusUid(4);
	        app.setAppTransTypeUid(2);
	        app.setCompanyUid(companyUid);
	        app.setExternalFlag('N');
	        app.setRequestDate(new Date());
	        app.setTransactionIssuanceDate(new Date());
	        app.setCreateModifiedBy(CreateModifiedBy);
	        app.setPostMarkDate(new Date());
	        app.setCreateModifiedDate(new Date());
	        return app;
	}
	public static Map getAppCounts(List<TierMailouts> mailouts) {
		Set uniqueAppNos = new HashSet<String>();
		 Map uniqueAppCount = new HashMap<String,Integer>();
		 for(TierMailouts mailout:mailouts ){
			 uniqueAppNos.add(mailout.getAppno());
		 }
		 Iterator<String> it = uniqueAppNos.iterator();
		 while(it.hasNext()){
			 int appcount=0;
			 String appno=it.next();
			 for(TierMailouts mailout:mailouts ){
				 if(appno.equals(mailout.getAppno()))
				 ++appcount;
				 //uniqueApps.add(mailout.getAppno());
			 }
			 uniqueAppCount.put(appno, appcount);
		 }	
		 return uniqueAppCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add companyuid, calculated exipry date and regitem in mailout table;
		
		 TierMailoutsDaoImpl mailoutsDao = new TierMailoutsDaoImpl();
		 RegistrationItemsDaoImpl regItemsDao= new RegistrationItemsDaoImpl();
		 AppTransactionsDaoImpl appTransactionsDao = new AppTransactionsDaoImpl();
		 AppTransAssociationDaoImpl appTransAssociationDao = new AppTransAssociationDaoImpl();
		 LedgerDaoImpl ledgerDao = new LedgerDaoImpl();
		 TierMailouts mailout = null;
		 ApptransRegRelDaoImpl apptransRegRelDao = new ApptransRegRelDaoImpl();
		 
		 List<TierMailouts> mailouts = mailoutsDao.findByStatus('N');
	//	 mailouts=mailouts.subList(0, 2);// For Testing
		 System.out.println(">>>>>>> TierMailouts Size "+mailouts.size());
		 Map uniqueAppCount = getAppCounts(mailouts);
		// uniqueAppCount.
		 Iterator<String> it =  uniqueAppCount.keySet().iterator();
		 int appsprocessing =1;
		 while(it.hasNext()){
			
			 List<TierMailouts> appmailouts =new  ArrayList<TierMailouts>(); 
			 String appno= it.next();
			 for(TierMailouts tms:mailouts){
				 if(tms.getAppno().equals(it));
				 appmailouts.add(tms);
				 }
			 Integer regcount=(Integer) uniqueAppCount.get(appno);
			 AppTransactions app =createAppTxns(appmailouts.get(0).getCompanyuid());//pass companyUid
			 AppTransAssociation ata = createAppTransAssociation(app,new Integer(appno));// pass appNo
			 List<ApptransRegRel> atrlist=new  ArrayList<ApptransRegRel>();
			 
			 for(int i=0;i<regcount;i++){
				 ApptransRegRel atr =  createApptransRegRel(app,regItemsDao.findByTrackingNo(new Integer(appmailouts.get(i).getTrackingno())));// pass trackingNo
				 atrlist.add(atr);
			 }
			 Ledger led=createLedger(app,appmailouts.get(0).getCompanyuid());//pass companyUid
			 
			// mailout=mailouts.get(0);
			// mailout.setStatus('Y');//update status of that particular record
				 
			 appTransactionsDao.save(app);
			 appTransAssociationDao.save(ata);
			 for(ApptransRegRel apptranlist:atrlist ){
				 apptransRegRelDao.save(apptranlist);
			 }
			 ledgerDao.save(led);
			 for(TierMailouts tm:appmailouts ){
				 tm.setStatus('Y');
				 mailoutsDao.update(tm);
			 }
			
				++appsprocessing;
				System.out.println("After update "+appsprocessing);
				if(appsprocessing>2)break; //testing
			 
		 }
	}

}
