package com.spring.service;

import java.util.List;

import com.spring.dao.EmployeeDAO;
import com.spring.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public Employee fetchEmployee(int empId) {
		return employeeDAO.getEmployeeById(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		 employeeDAO.createEmployee(employee);;
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		return employeeDAO.getAllEmployeesDetails();
	}

	@Override
	public void deleteEmployee(int empId) {
		employeeDAO.deleteEmployeeById(empId);
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
		
	}
}
