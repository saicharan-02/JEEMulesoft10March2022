package com.abc.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class CalculatorMain {

	public static void main(String[] args) {
		
//		Calculator cal = (a,b) -> {
//			int c = a+b;
//			return c;
//		};
		
		Calculator cal = (a,b) -> a+b;
		
		int result = cal.sum(10,20);
		
		System.out.println("Result: "+result);
		
		List<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("jpa");		
		
		courses.forEach(x->System.out.println(x));
		
		BiFunction<Integer,Integer,Integer> biFun1 = (a,b) -> a+b; 
		
		int result1 = biFun1.apply(10, 20);
		
		System.out.println("sum: "+result1);
		
		

	}

}
