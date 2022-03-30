package com.main;

import com.abc.Circle;
import com.abc.Triangle;

public class OverridingDemo {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.area();
		
		Triangle triangle = new Triangle();
		triangle.area();

	}

}
