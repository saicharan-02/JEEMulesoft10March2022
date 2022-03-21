package com.abc.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
					
		ArrayList courses = new ArrayList(); // ordered collection and index based
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		courses.add(2, "hibernate");
		courses.add("sql");	
		
		System.out.println(courses);  //courses.toString() mehtod called
		
		Iterator i = courses.iterator();
		
		while(i.hasNext()) {
			
			//Object obj = i.next();			
			//String str = (String) obj;
			
			String str = (String) i.next();
			System.out.println(str);
		}		

	}

}
