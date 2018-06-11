package com.spring.service;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeService {
  public abstract Employee fetchEmployee(int empId);
  public abstract void addEmployee(Employee employee);
  public abstract List<Employee> getAllEmployeeInfo();
  public abstract void deleteEmployee(int empId);
  public abstract void updateEmployeeEmailById(String newEmail,int employeeId);
  
}
