package com.abc.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<>();
		emps.add(null);

		emps.add(null);

		emps.add(null);

		emps.add(null);
		
		
		
		Optional<String> op1 = Optional.of("hello");
		
		if(op1.isPresent() ) {
		  String s = op1.get();
		  System.out.println(s);
		}
		
		

	}

}
