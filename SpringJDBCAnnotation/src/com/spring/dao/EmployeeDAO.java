package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeDAO {
	public abstract Employee getEmployeeById(int employeeId);
	public abstract void createEmployee(Employee employee);
	public abstract List<Employee> getAllEmployeesDetails();
	public abstract void deleteEmployeeById(int employeeId);
	public abstract void updateEmployeeEmailById(String newEmail,int employeeId);
}
