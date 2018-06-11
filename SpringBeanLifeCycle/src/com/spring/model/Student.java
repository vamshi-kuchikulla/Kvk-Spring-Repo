package com.spring.model;

public class Student  {
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

	//@PostConstr
	public void init() throws Exception {
		System.out.println("passing vai init method ...... ");
	}

	//@PreDestroy
	public void destroy() throws Exception {
		System.out.println("passing vai destroy method ...... ");
	}
}

