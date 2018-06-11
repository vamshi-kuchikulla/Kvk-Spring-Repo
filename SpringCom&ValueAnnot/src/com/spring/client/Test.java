package com.spring.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.UserDetails;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		UserDetails user = ctx.getBean("userBean", UserDetails.class);
		user.getUsername();
		user.getPassword();
		System.out.println(user);
		ctx.close();
	}
}
