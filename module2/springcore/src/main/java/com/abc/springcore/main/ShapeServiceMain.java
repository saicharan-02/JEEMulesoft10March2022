package com.abc.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.beans.Circle;
import com.abc.springcore.service.ShapeAreaService;

public class ShapeServiceMain {

	public static void main(String[] args) {
		
//		Circle circle = new Circle();
//		circle.setRadius(20);
//		
//		ShapeAreaService service = new ShapeAreaService();
//		service.setShape(circle);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		ShapeAreaService service = (ShapeAreaService) context.getBean("shapeService");
		
		service.findArea();
		
		context.close();

	}

}
