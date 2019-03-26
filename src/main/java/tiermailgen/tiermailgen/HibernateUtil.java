package tiermailgen.tiermailgen;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import tiermailgen.tiermailgen.model.AppTransAssociation;
import tiermailgen.tiermailgen.model.AppTransactions;
import tiermailgen.tiermailgen.model.ApptransRegRel;
import tiermailgen.tiermailgen.model.Ledger;
import tiermailgen.tiermailgen.model.RegistrationItems;
import tiermailgen.tiermailgen.model.RegitemDetails;
import tiermailgen.tiermailgen.model.TierMailouts;

public class HibernateUtil {
	 
    private static SessionFactory sessionFactory = null;
 
    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            System.err.println("Exception while initializing hibernate util.. ");
            e.printStackTrace();
        }
    }
 
    public static void loadSessionFactory(){
 
        Configuration configuration = new Configuration();
        ///tiermailgen/src/main/java/tiermailgen/tiermailgen/HibernateUtil.java
        ///tiermailgen/src/main/java/hibernate.cfg.xml
        configuration.configure("../../../hibernate.cfg.xml");
        configuration.addAnnotatedClass(TierMailouts.class);
        configuration.addAnnotatedClass(AppTransactions.class);
        configuration.addAnnotatedClass(AppTransAssociation.class);
       configuration.addAnnotatedClass(ApptransRegRel.class);
       
       configuration.addAnnotatedClass(RegistrationItems.class);
       configuration.addAnnotatedClass(Ledger.class);
      configuration.addAnnotatedClass(RegitemDetails.class);
      
        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(srvcReg);
    }
 
    public static Session getSession() throws HibernateException {
 
        Session retSession=null;
            try {
                retSession=sessionFactory.openSession();
            }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
            }
            if(retSession == null) {
                System.err.println("session is discovered null");
            }
 
            return retSession;
    }
}