package tiermailgen.tiermailgen;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String a[]) {
		 
		 TierMailoutsDaoImpl mailoutsDao = new TierMailoutsDaoImpl();
		 AppTransactionsDaoImpl appTransactionsDao = new AppTransactionsDaoImpl();
		 AppTransAssociationDaoImpl appTransAssociationDao = new AppTransAssociationDaoImpl();
		 LedgerDaoImpl ledgerDao = new LedgerDaoImpl();
		 RegistrationItemsDaoImpl regItemsDao= new RegistrationItemsDaoImpl();
		 ApptransRegRelDaoImpl apptransRegRelDao = new ApptransRegRelDaoImpl();
		// TierMailouts mailout = mailoutsDao.getTierMailoutsById(1307);
		 List<TierMailouts> mailouts = mailoutsDao.findByStatus('N');
	   //     System.out.println(mailout.getAppno());
	       // AppTransactions appTransactions = appTransactionsDao.getAppTransactionsById(1);
	       // System.out.println("---------------------------"+appTransactions.getAppTransAssociations().size());
	 
	        System.out.println("---------------------------");
	       // RegistrationItems ri = new RegistrationItems();
	        RegistrationItems ri = regItemsDao.findByTrackingNo(9800171);
	        System.out.println("---------------------------"+ri.getRegItemUid());
		       Transaction transaction = null;
		       Session session = null;
		       session = HibernateUtil.getSession();
	
		    AppTransactions app =new AppTransactions();
	        app.setAppTransStatusUid(4);
	        app.setAppTransTypeUid(2);
	        app.setCompanyUid(ri.getCompanyUid());
	        app.setExternalFlag('N');
	        app.setRequestDate(new Date());
	        app.setTransactionIssuanceDate(new Date());
	        app.setCreateModifiedBy("47358");
	        app.setPostMarkDate(new Date());
	        app.setCreateModifiedDate(new Date());
	        
	        //appTransactionsDao.save(app);
	        
	        AppTransAssociation ata = new AppTransAssociation();
	        ata.setApplicationUid(ri.getApplicationUid());
	        ata.setAppTransactions(app);
	        ata.setCreateModifiedBy("47358");
	        ata.setCreateModifiedDate(new Date());
	        
	        ApptransRegRel atr = new ApptransRegRel();
	        System.out.println("---------------------------"+ri.getRegItemUid());
	   	 
	        List<RegistrationItems> applist= regItemsDao.findByApplicationUid(3146);

	        for(int i=0; i< applist.size();i++){
		        
	        	System.out.println("Regitem "+i+1+" "+applist.get(i).getApplicationUid()+">>>>>>>>>>>>>>"+applist.get(i).getRegItemUid());	        	

	        	  atr.setAppRegItemStatusUid(4);
	  	        atr.setRegItemUid(applist.get(i).getRegItemUid());
	  	        atr.setRequestActionsUid(57);
	  	        atr.setDecisionActionUid(58);
	  	        atr.setFulFilledFlag(null);
	  	        atr.setRegItemAmount(new BigDecimal(0.00));
	  	        atr.setCalulatedExpiration(applist.get(i).getExpirationDate());
	  	        atr.setActionRequestedDate(new Date());
	  	        atr.setActionRequestedBy("47358");
	  	        atr.setCreateModifiedBy("47358");
	  	        atr.setCreateModifiedDate(new Date());
	  	        atr.setAppTransactions(app);
	  	        
	  	        
	        }
	        
	        
	      
	       // atr.setRegistrationItems(ri);
	       
	       // atr.setRegistrationItems( EntityManager.getReference(RegistrationItems.class, ri.getRegItemUid()));
	        
	        Ledger led= new Ledger();
	        led.setLedgerActionTypeUid(2);
	        led.setCompanyUid(ri.getCompanyUid());
	        led.setAppTransactions(app);
	        led.setAmount(new BigDecimal(0.00));
	        led.setActiveFlag('Y');
	        led.setCreateModifiedBy("47358");
	        led.setCreateModifiedDate(new Date());
	        led.setCreationDate(new Date());
	        
	        
	        session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
	        //Set<AccountEntity> accounts = new HashSet<AccountEntity>();
	        
            appTransactionsDao.save(app);
	        appTransAssociationDao.save(ata);
	        ri.setCreateModifiedDate(new Date());
	      // regItemsDao.saveOrUpdate(ri);
	   // apptransRegRelDao.insertAppTranRegRel(atr);
	        apptransRegRelDao.save(atr);
	        ledgerDao.save(led);
	        transaction.commit();
	        session.close();
	    }
}
