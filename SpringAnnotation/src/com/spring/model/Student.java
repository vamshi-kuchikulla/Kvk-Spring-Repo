package com.spring.model;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int id;
	private String Name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}
    
	/**
	 * here this filed makes it mandatory
	 * @param name
	 */
	@Required
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
}
