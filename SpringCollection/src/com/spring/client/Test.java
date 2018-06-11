package com.spring.client;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.EmpInfo;
import com.spring.model.Employee;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Map-Beans.xml");
		EmpInfo comEmp = context.getBean("empInfo", EmpInfo.class);

		Map<Integer, String> companyInfo = comEmp.getCompanyInfo();
		Set<Entry<Integer, String>> entrySet = companyInfo.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		System.out.println("---------------------------------------------");

		Map<Integer, Employee> empInfo = comEmp.getEmpInfo();
		Set<Entry<Integer, Employee>> entrySet2 = empInfo.entrySet();
		for (Entry<Integer, Employee> entry : entrySet2) {
			System.out.println(entry.getKey());
			Employee emp = entry.getValue();
			System.out
					.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getEmail() + "\t" + emp.getGender());
		}
		System.out.println("---------------------------------------------");
		context.close();
	}
}
