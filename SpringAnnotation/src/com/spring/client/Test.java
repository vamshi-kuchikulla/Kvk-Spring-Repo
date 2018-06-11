package com.spring.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.HelloConfig;
import com.spring.config.StudentConfig;
import com.spring.model.Message;
import com.spring.model.Student;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class, HelloConfig.class);
		
		Student student = ctx.getBean(Student.class);
		student.setId(101);
		student.setName("Kvk");
		student.toString();
		System.out.println(student);
		
		Message message = ctx.getBean(Message.class);
		message.setMessage("Hello World....!");
		message.getMessage();
		ctx.close();
	}
}
