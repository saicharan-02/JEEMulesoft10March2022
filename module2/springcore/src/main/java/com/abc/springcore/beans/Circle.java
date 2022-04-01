package com.abc.springcore.beans;

public class Circle implements Shape  {

	private int radius;	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}	

	@Override
	public void area() {
		double r = 3.14 * radius * radius;		
		System.out.println("circle area: "+r);		
	}	
}
