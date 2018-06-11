package com.datwin.hibernate.controller;

import org.hibernate.Session;

import com.datwin.hibernate.model.Employee;
import com.datwin.hibernate.utill.HibernateUtill;

public class Test {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("kvk");
        e1.setRole("Ceo");  
        
          //Get Session
        Session session = HibernateUtill.getSessionFactory().openSession();
        
          //begin Transaction
        session.beginTransaction();
        
        // Save the model object
        session.save(e1);
        
        //commit transaction
        session.getTransaction().commit();
		System.out.println("Employee ID="+e1.getId());
		
		//terminate session factory, otherwise program won't end
		HibernateUtill.getSessionFactory().close();
	}
}
