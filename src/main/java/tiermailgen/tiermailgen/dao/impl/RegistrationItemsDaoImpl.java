package tiermailgen.tiermailgen.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import tiermailgen.tiermailgen.model.RegistrationItems;

public class RegistrationItemsDaoImpl extends BaseDaoImpl {

	 public RegistrationItems findByTrackingNo(int trackingNo)
	  {
		 

	    return (RegistrationItems)getCurrentSession().createCriteria(RegistrationItems.class)
	    		.add(Restrictions.eq("trackingNo", trackingNo))
	    		.add(Restrictions.isNotNull("applicationUid"))
	    		.add(Restrictions.isNotNull("companyUid"))
	    		.uniqueResult();
	  }
	 public RegistrationItems findByRegItemId(int regItemId)
	  {
		 
		 
	    return (RegistrationItems)getCurrentSession().createCriteria(RegistrationItems.class)
	    		.add(Restrictions.eq("regItemUid", regItemId))
	    		.add(Restrictions.isNotNull("applicationUid"))
	    		.add(Restrictions.isNotNull("companyUid"))
	    		.uniqueResult();
	  }
	 @SuppressWarnings("unchecked")
	public List<RegistrationItems> findByApplicationUid(int applicationUid)
	  {
	    return getCurrentSession().createCriteria(RegistrationItems.class)
	    		.add(Restrictions.eq("applicationUid", applicationUid)).list();
	  }
}
