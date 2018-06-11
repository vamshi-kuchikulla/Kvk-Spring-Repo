package com.spring.model;

public class HrImpl {
	private Appointment appointHr;

	public HrImpl(Appointment appoint) {
		super();
		this.appointHr = appoint;
	}
	
	public void appointHr() {
		appointHr.appoint();
	}
}
