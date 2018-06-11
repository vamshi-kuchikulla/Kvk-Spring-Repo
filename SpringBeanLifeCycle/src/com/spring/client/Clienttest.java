package com.spring.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;

public class Clienttest {

	public static void main(String[] args) {
	 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	 Student s  = ctx.getBean("student" , Student.class);
	 s.getId();
	 s.getName();
	 s.getGender();
	 s.getPan();
	 System.out.println(s);
	 ctx.close();
	}
}
