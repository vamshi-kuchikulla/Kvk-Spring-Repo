package com.spring.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.model.HrImpl;


public class TestCI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		EmployeeImpl impl = context.getBean("employeeImpl", EmployeeImpl.class);
//		impl.appoint();
		
		HrImpl hr = context.getBean("hrImpl", HrImpl.class);
		hr.appointHr();
		((AbstractApplicationContext) context).close();
	}
}
