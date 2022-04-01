package com.abc.springcore.beans;

public class Triangle implements Shape  {

	private int base;
	private int height;	
	
	public void setBase(int base) {
		this.base = base;
	}
	public void setHeight(int height) {
		this.height = height;
	}	
	
	@Override
	public void area() {
		
		double area = 0.5*base*height;
		System.out.println("Triagnle Area: "+area);
	}
	
}
