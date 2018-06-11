package com.dsnptrn.singleton;

public class Singleton {
	
	private static Singleton singleton;

	private Singleton() {
		
	}
	
	public static Singleton getSingletonInstance() {
		if(singleton==null) {
			singleton= new Singleton();
		}
		return singleton;
	}
}
