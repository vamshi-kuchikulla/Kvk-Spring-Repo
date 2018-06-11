package com.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private int id;
	private String name;
	private String Gender;
	private String pan;

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Gender=" + Gender + ", pan=" + pan + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("passing vai afterProperties method ...... ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("passing vai destroy method ...... ");
	}
}
