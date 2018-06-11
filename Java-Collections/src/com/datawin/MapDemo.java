package com.datawin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
       Map<Integer, List<Employee>> m = new HashMap<Integer, List<Employee>>();
        Employee e5  = new Employee(105, "kvk",100000, "CEO");
		Employee e6  = new Employee(106, "kvr",100001, "CTO");
		Employee e7  = new Employee(107, "ksr",100002, "TL");
		Employee e8  = new Employee(108, "kbr",100003, "HR");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e5);
		al.add(e6);
		al.add(e7);
		al.add(e8);
		
       m.put(101, al);
       
	}
}
