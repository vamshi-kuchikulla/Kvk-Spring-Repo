package com.spring.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.model.Pancard;

public class Test {
	public static void main(String[] args) {
       AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
       Employee emp = ctx.getBean("employee", Employee.class);
       if(emp != null) {
    	   System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getEmail() + "\t" + emp.getGender());
    	   Pancard pan = emp.getPancard();
    	   System.out.println(pan.getHolderName()+"\t"+pan.getPanNumber());
    	   ctx.close();
       }
	}
}
