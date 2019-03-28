package tiermailgen.tiermailgen.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import tiermailgen.tiermailgen.HibernateUtil;
import tiermailgen.tiermailgen.model.TierMailouts;

public class TierMailoutsDaoImpl extends BaseDaoImpl {

	public TierMailouts getTierMailoutsById(int i){
		 
        Session session = null;
        TierMailouts mailout = null;
        try {
            session = HibernateUtil.getSession();
          //  String queryStr = "select emp from Employee emp";
            mailout = (TierMailouts) session.get(TierMailouts.class, i);
 
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return mailout;
    }
	public List<TierMailouts> findByTrackingno(String trackingno)
	  {
	    return getCurrentSession().createCriteria(TierMailouts.class).add(Restrictions.eq("trackingno", trackingno)).list();
	  }
	public List<TierMailouts> findByStatus(Character status)
	  {
	    return getCurrentSession().createCriteria(TierMailouts.class).add(Restrictions.eq("status", status)).list();
	  }
	
	 public void update(TierMailouts tierMailout)
	  {
	    super.update(tierMailout);
	  }
}
