package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		String SQL = "select * from test.employee where empId=?";
		Employee employee = jdbcTemplate.queryForObject(SQL, new EmployeeRowMapper(), empId);

		System.out.println("in DAO : " + employee);
		return employee;
	}

	@Override
	public void createEmployee(Employee e) {
		String SQL = "insert INTO test.employee (empId, empName, email, salary, age) VALUES(?,?,?,?,?)";
		 int update = jdbcTemplate.update(SQL, e.getEmpId(), e.getEmpName(), e.getEmail(), e.getSalary(), e.getAge());
		  if(update>0) {
			  System.out.println(e+"Employee Created !!!!!!!!!");
		  }
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		String SQL ="select * from test.employee";
		List<Employee> list = jdbcTemplate.query(SQL, new EmployeeRowMapper());
		return list;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL ="delete from test.employee where empId=?";
		   int update = jdbcTemplate.update(SQL, employeeId);
		   if(update>0) {
				  System.out.println("Employee is Deleted !!!!!!!!!");
			  }
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		String SQL="UPDATE test.employee set email=? WHERE empId=?";
		int update = jdbcTemplate.update(SQL, newEmail,employeeId);
		if(update>0)
			System.out.println("Email is updated..");
	}

}
