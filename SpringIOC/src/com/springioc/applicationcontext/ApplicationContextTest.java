package com.springioc.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("employee.xml");
		Employee e = c.getBean("employee", Employee.class);
		e.setEmpId(101);
		e.setEmpName("kvk");
		e.getEmpId();
		e.getEmpName();
		System.out.println(e);
		
		Employee e1 = c.getBean("employee", Employee.class);
		e1.getEmpId();
		e1.getEmpName();
		System.out.println(e1);
		
		((AbstractApplicationContext) c).close();
	}
}
