package com.datwin.hibernate.utill;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtill {
	
	private static SessionFactory session;
	
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configure = new Configuration().configure("hibernate-cfg.xml");
			System.out.println("Hibernate Annotation Configuration loaded"); 	
			 
			ServiceRegistry register = new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build();
			System.out.println("Hibernate Annotation serviceRegistry created");
			
			SessionFactory session = configure.buildSessionFactory(register);
			return session;
		}catch(Throwable tx) {
			// Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + tx);
            throw new ExceptionInInitializerError(tx);
		}
	}
	

	public static SessionFactory getSessionFactory() {
		if(session == null) {
			session = buildSessionFactory();
		}
        return session;
    }
	
}
