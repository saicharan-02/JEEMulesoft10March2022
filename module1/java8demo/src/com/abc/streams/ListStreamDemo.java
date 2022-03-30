package com.abc.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ListStreamDemo {

	public static void main(String[] args) {
		
		
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("sql");
		courses.add("c++");
		courses.add("git");
		
		//Stream<String> stream = courses.stream();
		
		courses.stream().map(x->x.length()).forEach(x->System.out.println(x));
		
		
		Integer[] nums = {10,25,36,28,15};		
		Stream<Integer> numsStream = Arrays.stream(nums);
		
		//numsStream.filter(x->x>25).forEach(x->System.out.print(x+ " "));
		
		Optional<Integer> optional = numsStream.reduce((a,b)-> a+b);
		
		int sum = optional.get();
		
		System.out.println("Sum: "+sum);
		

	}

}
