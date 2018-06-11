package com.lambda;

public class Singleton {
	
	private static Singleton singleton;
	
	private static void Singleton() {		
	}
    
	// lazy Initialization 
	public static Singleton getSingleton() {
		if(singleton == null) {
			return new Singleton();
		}
		return singleton;
	}
}

class Singleton1 {
private static Singleton1 singleton =  new Singleton1();
	
	private static void Singleton1() {
		
	}
	
	//Eegar Intialization
	public static Singleton1 getSingleton1() {
		return singleton;
	}
}


class Singleton2 {
	
	private static Singleton2 singleton;
	
	private static void Singleton2() {
		
	}
    
	// lazy Initialization with thread safe
	public static synchronized Singleton2 getSingleton() {
		if(singleton == null) {
			singleton =  new Singleton2();
		}
		return singleton;
	}
}

 class Test {
	public static void main(String[] args) {
        Singleton s1 =  Singleton.getSingleton();
        Singleton s2 =  Singleton.getSingleton();
        Singleton s3 =  Singleton.getSingleton();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
	}
}


