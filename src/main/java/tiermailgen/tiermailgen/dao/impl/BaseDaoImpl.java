package tiermailgen.tiermailgen.dao.impl;

import java.io.Serializable;
import java.util.Collection;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import tiermailgen.tiermailgen.HibernateUtil;
import tiermailgen.tiermailgen.dao.BaseDao;

public class BaseDaoImpl
  implements BaseDao
{
	 @Autowired
	  public static Session sf;
	 static {
	        try{
	        	sf=HibernateUtil.getSession();
	        }catch(Exception e){
	            System.err.println("Exception while initializing hibernate util.. ");
	            e.printStackTrace();
	        }
	    }
  
  protected Session getCurrentSession()
  {
    return this.sf;
  }
  
  public Serializable save(Object obj)
  {
    return getCurrentSession().save(obj);
  }
  
  public void update(Object o)
  {
    getCurrentSession().merge(o);
    getCurrentSession().flush();
  }
  
  public void delete(Object o)
  {
    getCurrentSession().delete(o);
  }
  public void persist(Object o)
  {
    getCurrentSession().persist(o);
  }
  public void merge(Object o)
  {
    getCurrentSession().merge(o);
  }
  
  public void saveOrUpdate(Object o)
  {
    getCurrentSession().saveOrUpdate(o);
  }
  
  public void saveOrUpdateAll(Collection objs)
  {
    for (Object obj : objs) {
      getCurrentSession().saveOrUpdate(obj);
    }
  }
  
  public void deleteAll(Collection objs)
  {
    for (Object obj : objs) {
      getCurrentSession().delete(obj);
    }
  }
}
