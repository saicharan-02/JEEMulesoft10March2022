package com.abc.springcore.service;

import com.abc.springcore.beans.Shape;

public class ShapeAreaService {

	private Shape shape;

	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void findArea() {		
		
		shape.area();
	}
}
