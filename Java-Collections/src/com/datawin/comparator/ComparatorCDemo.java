package com.datawin.comparator;

import java.util.Arrays;

public class ComparatorCDemo {
	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		e[0]= new Employee(10, "Mikey", 25, 10000);
		e[1]= new Employee(20, "Arun", 29, 20000);
		e[2]= new Employee(5, "Lisa", 35, 5000);
		e[3]= new Employee(1, "Pankaj", 32, 50000);
		
		Arrays.sort(e);
	
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(e));
	}
}
