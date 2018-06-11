package com.spring.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;
import com.spring.service.EmployeeServiceImpl;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImpl.class);

		createEmployee(employeeService);
		getEmployeeById(employeeService);
		getAllEmployeeInfo(employeeService);
//		employeeService.deleteEmployee(106);
//		employeeService.updateEmployeeEmailById("k@vgmail.com", 105);
		ctx.close();

	}

	private static void getAllEmployeeInfo(EmployeeService employeeService) {
		List<Employee> allEmployeeInfo = employeeService.getAllEmployeeInfo();

		for (Employee e : allEmployeeInfo) {
			System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getEmail() + "\t" + e.getSalary() + "\t"
					+ e.getAge());
		}
	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee e = new Employee();
		e.setEmpId(106);
		e.setEmpName("driti");
		e.setEmail("d@vmail.com");
		e.setSalary(960000);
		e.setAge(02);
		employeeService.addEmployee(e);

	}

	private static void getEmployeeById(EmployeeService employeeService) {
		Employee employee = employeeService.fetchEmployee(102);
		System.out.println(employee.getEmpId() + "\t" + employee.getEmpName() + "\t" + employee.getEmail() + "\t"
				+ employee.getAge() + "\t" + employee.getSalary());
	}

}
