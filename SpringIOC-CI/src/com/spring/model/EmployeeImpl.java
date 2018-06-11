package com.spring.model;

public class EmployeeImpl {

	private Appointment appointEmployee;
	
	/**
	 * @param appointEmployee the appointEmployee to set
	 */
	public void setAppointEmployee(Appointment appointEmployee) {
		this.appointEmployee = appointEmployee;
	}
	
	public void appoint() {
		appointEmployee.appoint();
	}

}
