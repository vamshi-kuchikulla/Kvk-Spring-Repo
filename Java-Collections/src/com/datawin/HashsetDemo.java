package com.datawin;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private float salary;
	private String designation;

	public Employee(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int compareTo(Employee e) {
		if (id > e.id) {
			return 1;
		} else if (id < e.id) {
			return -1;
		} else {
			return 0;
		}

	}
}

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashsetDemo {
	public static void main(String[] args) {
		Set<Employee> h = new HashSet<Employee>();
		Employee e1 = new Employee(101, "kvk", 100000, "CEO");
		Employee e2 = new Employee(102, "kvr", 100000, "CTO");
		Employee e3 = new Employee(103, "ksr", 100000, "TL");
		Employee e4 = new Employee(104, "kbr", 100000, "HR");

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		

		for (Employee e : h) {
			System.out.println(e.getId() + ", " + e.getName() + ", " + e.getSalary() + ", " + e.getDesignation());
		}

		Set<Employee> ts = new TreeSet<Employee>();

		Employee e5 = new Employee(104, "kvk", 100000, "CEO");
		Employee e6 = new Employee(105, "kvr", 100001, "CTO");
		Employee e7 = new Employee(106, "ksr", 100002, "TL");
		Employee e8 = new Employee(107, "kbr", 100003, "HR");

		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		ts.add(e8);
		for (Employee e : ts) {
			System.out.println(e.toString());
		}

	}
}
