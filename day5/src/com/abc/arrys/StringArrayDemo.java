package com.abc.arrys;

public class StringArrayDemo {

	public static void main(String[] args) {
		
		String name = new String("abc"); // string object creation
		
		String[] courses = new String[4];  // array object object creation which holds string object references
		
		courses[0]= "java";
		courses[1]= "sql";
		courses[2]= "devOps";
		courses[3]= "jenkkins";
		
		for(String s:courses) {
			System.out.println(s);
		}
		

	}

}
