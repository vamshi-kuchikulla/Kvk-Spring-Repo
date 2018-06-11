package com.spring.client;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;
import com.spring.service.StudentService;
import com.spring.service.StudentServiceImpl;

public class Test {
	public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        StudentService service = ctx.getBean("studentService", StudentServiceImpl.class);
        addStudent(service);
        getStudentById(service);
        ctx.close();
	}

	private static void getStudentById(StudentService service) {
		Student s = service.getStudentById(3);
		System.out.println(s.getName()+"\t"+s.getEmail());
	}

	private static void addStudent(StudentService service) {
		Student s = new Student();
		s.setName("kar");
		s.setEmail("k@amail.com");
		s.setAge(2);
		service.addStudent(s);
		
	}
}
