package com.abc.main;

import com.abc.service.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int result = cal.sum(-10, 20);
		System.out.println("Sum: "+result);
	}

}
