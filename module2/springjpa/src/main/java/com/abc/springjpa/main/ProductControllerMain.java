package com.abc.springjpa.main;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springjpa.controller.ProductController;
import com.abc.springjpa.entity.Product;

public class ProductControllerMain {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		ProductController controller = context.getBean(ProductController.class);
		
//		Product product = new Product();
//		product.setProductName("IphoneX");
//		product.setProductPrice(580000);
//		product.setCreatedOn(LocalDate.of(2018, 10, 10));
//		product.setCategory("mobile");		
//		
//		controller.addProduct(product);
		
//		int productId = 1;
//		
//		controller.searchProductById(productId);
		
		controller.fetchAllProducts();
		
		context.close();

	}

}
