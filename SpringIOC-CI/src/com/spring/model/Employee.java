package com.spring.model;

public class Employee implements Appointment {
	
	/* (non-Javadoc)
	 * @see com.spring.model.Appointment#appointEmployee()
	 */
	@Override
	public void appoint() {
		System.out.println("appoint employee via EmployeeImpl   :");
	}
}
