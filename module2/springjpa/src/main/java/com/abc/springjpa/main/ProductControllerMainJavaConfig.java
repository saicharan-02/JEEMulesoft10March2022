package com.abc.springjpa.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.springjpa.controller.AppConfig;
import com.abc.springjpa.controller.ProductController;

public class ProductControllerMainJavaConfig {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductController productController = context.getBean(ProductController.class);
		
		productController.fetchAllProducts();
		
		context.close();
	}

}
