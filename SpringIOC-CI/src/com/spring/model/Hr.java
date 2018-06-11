package com.spring.model;

public class Hr implements Appointment{

	@Override
	public void appoint() {
		System.out.println("appoint Hr via HrImpl     ");
	}

}
