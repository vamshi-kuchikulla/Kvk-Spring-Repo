package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstIOC {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("hello-beans.xml");
		Hello obj = (Hello) context.getBean("hello");
		obj.getMessage();
		
		ApplicationContext ap  = new ClassPathXmlApplicationContext("student-bean.xml");
		Student s = (Student)ap.getBean("student");
		s.getId();
		s.getName();
		s.getAge();
		s.getCollage();
		System.out.println(s);
 	}
}
