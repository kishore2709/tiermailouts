package tiermailgen.tiermailgen.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import tiermailgen.tiermailgen.HibernateUtil;
import tiermailgen.tiermailgen.model.ApptransRegRel;

public class ApptransRegRelDaoImpl extends BaseDaoImpl {
	public void insertAppTranRegRel(ApptransRegRel apptransRegRel ){
		 
        Session session = null;
        try {
        	
        	session = HibernateUtil.getSession();
        //	session = 	HibernateUtil.getSession();
        	Query query = getCurrentSession().createQuery("insert into ApptransRegRel" +
        			" (actionRequestedBy, actionRequestedDate, appRegItemStatusUid, appTransUid," +
        			" calulatedExpiration, createModifiedBy, createModifiedDate, decisionActionUid," +
        			" decisionDate, feeAdjustAmount, fulFilledFlag, issuanceDate," +
        			" placardRequestFlag, regItemAmount, requestActionsUid, stickerRequestFlag," +
        			" tokenAllowCount, tokenCount, tokenExpDate, withdrawRequestDate, " +
        			"withdrawRequestFlag, RegItem_UID)" +
        			" values (" +
        			":Action_Requested_By,:Action_Requested_Date, :AppRegItemStatus_UID, :AppTrans_UID," +
        			" :Calulated_Expiration, :Create_Modified_By, :Create_Modified_Date, :DecisionAction_UID," +
        			" :Decision_Date, :Fee_Adjust_Amount, :FulFilled_Flag, :Issuance_Date," +
        			" :Placard_Request_Flag, :RegItem_Amount, :RequestActions_UID, :Sticker_Request_Flag," +
        			" :Token_Allow_Count, :Token_Count, :Token_Exp_Date, :Withdraw_Request_Date, " +
        			":Withdraw_Request_Flag,:regItemUid)");
        			
            query.setParameter("Action_Requested_By", apptransRegRel.getActionRequestedBy());
            query.setParameter("Action_Requested_Date", apptransRegRel.getActionRequestedDate());
            query.setParameter("AppRegItemStatus_UID", apptransRegRel.getAppRegItemStatusUid());
            query.setParameter("AppTrans_UID", apptransRegRel.getAppTransactions().getAppTransUid());
            query.setParameter("Calulated_Expiration", apptransRegRel.getCalulatedExpiration());
            query.setParameter("Create_Modified_By", apptransRegRel.getCreateModifiedBy());
            query.setParameter("Create_Modified_Date", apptransRegRel.getCreateModifiedDate());
            query.setParameter("DecisionAction_UID", apptransRegRel.getDecisionActionUid());
            query.setParameter("Decision_Date", apptransRegRel.getDecisionDate());
            query.setParameter("Fee_Adjust_Amount", apptransRegRel.getFeeAdjustAmount());
            query.setParameter("FulFilled_Flag", apptransRegRel.getFulFilledFlag());
            query.setParameter("Issuance_Date", apptransRegRel.getIssuanceDate());
            query.setParameter("Placard_Request_Flag", apptransRegRel.getPlacardRequestFlag());
            query.setParameter("RegItem_Amount", apptransRegRel.getRegItemAmount());
            query.setParameter("RequestActions_UID", apptransRegRel.getRequestActionsUid());
            query.setParameter("Sticker_Request_Flag", apptransRegRel.getStickerRequestFlag());
            query.setParameter("Token_Allow_Count", apptransRegRel.getTokenAllowCount());
            query.setParameter("Token_Count", apptransRegRel.getTokenCount());
             
            query.setParameter("Token_Exp_Date", apptransRegRel.getTokenExpDate());
            query.setParameter("Withdraw_Request_Date", apptransRegRel.getWithdrawRequestDate());
            query.setParameter("Withdraw_Request_Flag", apptransRegRel.getWithdrawRequestFlag());
            query.setParameter("regItemUid", apptransRegRel.getRegItemUid());


            int result = query.executeUpdate();
        	//session.save(apptransRegRel);
           // System.out.println("inserted"+apptransRegRel.getAppTransRegRelUid());
        	
            System.out.println("inserted"+result+"  record");

        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }

}
