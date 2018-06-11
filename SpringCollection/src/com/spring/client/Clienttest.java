package com.spring.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;

public class Clienttest {

	public static void main(String[] args) {
	 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	 Student s  = ctx.getBean("student" , Student.class);
	 String firstName[] =s.getFirstName();
	 for(String s1: firstName) {
		 System.out.println(s1);
	 }
	 
	 System.out.println("-----------------------------------------------------");
	 
	 List<String> lastName = s.getLastName();
	 for(String s2: lastName) {
		 System.out.println(s2);
	 }
	 
	 System.out.println("-----------------------------------------------------");
	 
	 Set<Integer> id = s.getId();
	 for(Integer i: id) {
		 System.out.println(i);
	 }
	 ctx.close();
	}
}
