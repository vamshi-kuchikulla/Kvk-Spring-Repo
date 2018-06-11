package com.lambda;

public class GreetingTest {
	
	//direct call
	public void greet() {
		System.out.println("hello world");
	}
	
	//indirect call
	public void greet(GreetImpl grt) {
		grt.greet();
	}
	
	
	public static void main(String[] args) {
		GreetingTest g  = new GreetingTest();
		GreetImpl gi = new GreetImpl();
		g.greet();
		g.greet(gi);
		
		//lambda interface call
		GreetingInter lambda = () -> System.out.println("hello lambda interface expression");
		lambda.greet();
		
		//with inner class
		GreetingInter g1 = new GreetingInter() {
			@Override
			public void greet() {
				System.out.println("hello lambda inner class");
			}
		};
		
		g1.greet();
	}
}
