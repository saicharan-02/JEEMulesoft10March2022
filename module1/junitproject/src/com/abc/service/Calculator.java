package com.abc.service;

public class Calculator {

	public int sum(int a, int b) {
		int c = a+b;		
		return c;
	}
	
	public int div(int a, int b) throws ArithmeticException {		
	   int c = a / b;		
	   return c;
	}
	
}
