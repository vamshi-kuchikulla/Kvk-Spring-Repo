package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Message;

@Configuration
public class HelloConfig {

	@Bean
	public Message message() {
		return new Message();
	}
}
