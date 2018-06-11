package com.datawin;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapDemo {
	public static void main(String[] args) {
		Map<Integer, Employee> hm = new HashMap<Integer, Employee>(); 
		Employee e1  = new Employee(101, "kvk",100000, "CEO");
		Employee e2  = new Employee(102, "kvr",100000, "CTO");
		Employee e3  = new Employee(103, "ksr",100000, "TL");
		Employee e4  = new Employee(104, "kbr",100000, "HR");
		
		hm.put(101, e1);
		hm.put(102, e2);
		hm.put(103, e3);
		hm.put(104, e4);
		
		for(Map.Entry<Integer, Employee> entry: hm.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.print(key+" :");
			System.out.println(e.toString());
		}
		
		
		Map<Integer, Employee> tm = new TreeMap<Integer, Employee>();
		Employee e5  = new Employee(105, "kvk",100000, "CEO");
		Employee e6  = new Employee(106, "kvr",100001, "CTO");
		Employee e7  = new Employee(107, "ksr",100002, "TL");
		Employee e8  = new Employee(108, "kbr",100003, "HR");
		tm.put(1, e6);
		tm.put(2, e5);
		tm.put(3, e4);
		tm.put(4, e3);
		tm.put(5, e2);
		tm.put(6, e1);
		tm.put(7, e7);
		tm.put(8, e8);
		
		for(Map.Entry<Integer, Employee> entry: tm.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.print(key +" :");
			System.out.println(e.toString());
		}
		
		
	}
}
