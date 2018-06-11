package com.spring.client;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Message;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

		ctx.start();

		Message message = ctx.getBean("message", Message.class);
		message.getMessageId();
		message.getMessage();
		System.out.println(message);

		System.out.println("-------------------------------");
		ctx.stop();
		ctx.close();
	}
}
