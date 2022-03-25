package com.abc.lambda;

public class DemoOne {

	public static void main(String[] args) {
		
		//MyInterface mi = new MyClass();
		//mi.m1();
		
		
		MyInterface mi = new MyInterface() {

			@Override
			public void m1() {			
			  System.out.println("m1 definition ...");	
			}

		};
		
		mi.m1();
		
		System.out.println("Lambda expression");
		
		
		MyInterface mi2 = () -> System.out.println("m1 definition ...");
		
		mi2.m1();
		
	
		
		
		

	}

}
