package com.datawin;

class Singleton {
	private static Singleton singleton =null;
	
	public String s;

	Singleton() {
        s = "hi i am part of singleton";
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		s1.s = s1.s.toUpperCase();
		
		System.out.println(s1.toString()+ s1.s);
		System.out.println(s2.toString()+ s2.s);
		System.out.println(s3.toString()+ s3.s);
		System.out.println("\n");
		s3.s = s3.s.toLowerCase();
		
		System.out.println(s1.toString()+ s1.s);
		System.out.println(s2.toString()+ s2.s);
		System.out.println(s3.toString()+ s3.s);
	}
}
