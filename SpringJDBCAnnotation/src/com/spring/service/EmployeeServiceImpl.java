package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDAO;
import com.spring.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
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
