package com.abc.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet courses = new HashSet(); // unordered  and unsorted collection
		
		//LinkedHashSet courses = new LinkedHashSet(); //maintains insertion order
		
		TreeSet courses = new TreeSet();  // sorted collection
		
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		courses.add("sql");
		
		System.out.println(courses); 
		
	}

}
