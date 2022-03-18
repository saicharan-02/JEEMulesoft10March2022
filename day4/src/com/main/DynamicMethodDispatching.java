package com.main;

import java.util.Scanner;

import com.abc.Circle;
import com.abc.Shape;
import com.abc.Triangle;

public class DynamicMethodDispatching {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shape name:");
		String shapeName = sc.next();
		sc.close();
		
		Shape shape = null;
		
		if(shapeName.equals("circle")) {
			shape = new Circle();			
		}
		else if(shapeName.equals("triangle")) {
			shape = new Triangle();			
		}
		else {
			System.out.println("Invalid option.");
		}
		if((shape!= null)) {
			shape.area();
		}
		
	}

}
