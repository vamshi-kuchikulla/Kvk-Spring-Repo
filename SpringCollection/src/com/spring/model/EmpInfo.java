package com.spring.model;

import java.util.Map;

public class EmpInfo {
	private Map<Integer, String> companyInfo;
	private Map<Integer, Employee> empInfo;

	public Map<Integer, String> getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(Map<Integer, String> companyInfo) {
		this.companyInfo = companyInfo;
	}

	public Map<Integer, Employee> getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(Map<Integer, Employee> empInfo) {
		this.empInfo = empInfo;
	}

}
