package com.abc.main;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		int a = 10; 
		
		//converting int primitive to Integer object
		Integer i = new Integer(a);  // boxing
		
		//convert Object to primitive 		
		int k = i.intValue(); //unboxing
		
		//Java 5 introduced auto boxing and auto unboxing
		
		Integer t1 = 10;  // Integer t1 = new Integer(10); 
		
		int t2 = t1;   // t1.intValue();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);	
			
		

	}

}
