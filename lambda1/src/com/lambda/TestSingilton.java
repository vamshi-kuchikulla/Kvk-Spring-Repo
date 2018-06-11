package com.lambda;

public class TestSingilton {
	
	public static void main(String[] args) {
        Singleton s1 =  Singleton.getSingleton();
        Singleton s2 =  Singleton.getSingleton();
        Singleton s3 =  Singleton.getSingleton();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
	}
}
