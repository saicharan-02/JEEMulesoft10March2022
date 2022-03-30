package com.abc.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> courses = new ArrayList<>(); 
		
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
				
		//courses.add(10); //compiler error
		//courses.add(1.2); // compiler error

		System.out.println(courses);

		Iterator<String> i = courses.iterator();

		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str);
		}

	}

}
