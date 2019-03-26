package tiermailgen.tiermailgen.dao.impl;

import org.hibernate.Query;

import org.hibernate.Session;

import tiermailgen.tiermailgen.model.AppTransactions;

public class AppTransactionsDaoImpl extends BaseDaoImpl {
	public AppTransactions getAppTransactionsById(int id){
		 
        Session session = null;
        AppTransactions mailout = null;
        try {
           // session = HibernateUtil.getSession();
        	session = 	getCurrentSession();
         //   mailout = (AppTransactions) session.get(AppTransactions.class, i);
            Query query = session.createQuery("from AppTransactions s where s.appTransUid = :id");
            query.setParameter("id", id);
 
            mailout = (AppTransactions) query.list().get(0);
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return mailout;
    }
	/*
	
  public List<Long> findAmountByStoreId(String storeId)
  {
    System.out.println(">>>> In findAmountByStoreId storeId " + storeId);
    Criteria criteria = getCurrentSession().createCriteria(TerminalFloat.class);
    criteria.add(Restrictions.eq("store_id", storeId));
    
    criteria.setProjection(Projections.sum("terminal_curr_amt"));
    
    criteria.setProjection(Projections.sum("terminal_limit"));
    return criteria.list();
  }
  
  public TerminalFloat findByTerminalId(String terminalId)
  {
    return (TerminalFloat)getCurrentSession().createCriteria(TerminalFloat.class).add(Restrictions.eq("TERMINAL_ID", terminalId)).uniqueResult();
  }
  
  public void update(TerminalFloat terminalFloat)
  {
    super.update(terminalFloat);
  }
  
  public List<TerminalFloat> findByStoreId(String storeId)
  {
    return getCurrentSession().createCriteria(TerminalFloat.class).add(Restrictions.eq("store_id", storeId)).list();
  }
  
  public void updateTerminalCurrAmount(String terminalId, long terminalCurrAmount)
  {
    Query query = getCurrentSession().createQuery("update TerminalFloat set terminal_curr_amt = :terminal_curr_amt where terminal_id = :terminal_id");
    
    query.setParameter("terminal_curr_amt", Long.valueOf(terminalCurrAmount));
    query.setParameter("terminal_id", terminalId);
    int result = query.executeUpdate();
  }
	 */
}
