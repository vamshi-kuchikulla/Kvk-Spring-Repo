package com.dsnptrn.singleton;

public class SingletonTest {
	public static void main(String[] args) {
       for(int i=0; i<5; i++) {
    	   System.out.println("instance of singleton :"+Singleton.getSingletonInstance().hashCode());
       }
	}
}

