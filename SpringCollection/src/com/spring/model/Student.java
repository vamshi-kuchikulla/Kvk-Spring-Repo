package com.spring.model;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student {
	private String firstName[] = new String[4];
	private List<String> lastName;
	private Set<Integer> id;
	
	public String[] getFirstName() {
		return firstName;
	}
	public void setFirstName(String[] firstName) {
		this.firstName = firstName;
	}
	public List<String> getLastName() {
		return lastName;
	}
	public void setLastName(List<String> lastName) {
		this.lastName = lastName;
	}
	public Set<Integer> getId() {
		return id;
	}
	public void setId(Set<Integer> id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + Arrays.toString(firstName) + ", lastName=" + lastName + ", id=" + id + "]";
	}
  
}
