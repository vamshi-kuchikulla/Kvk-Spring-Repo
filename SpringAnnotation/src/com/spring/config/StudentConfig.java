package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Student;

@Configuration
public class StudentConfig {
		
	@Bean
	public Student student() {
		return new Student();
	}
}
