package com.abc.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.springjpa.entity.Product;
import com.abc.springjpa.exception.ProductNotFoundException;
import com.abc.springjpa.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

//	public void setProductService(ProductService productService) {
//		this.productService = productService;
//	}
	
	public void addProduct(Product product) {
		//input validation logic and request processing logic goes here
		productService.saveProduct(product);
		System.out.println("Product saved.");
	}
	
	public void searchProductById(int productId) {
		
		try {
			Product product = productService.fetchProductById(productId);
			System.out.println("Name: "+product.getProductName());
			System.out.println("Price: "+product.getProductPrice());
			System.out.println("Date: "+product.getCreatedOn());
			System.out.println("Category: "+product.getCategory());
			
		}
		catch(ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}		
	}
}
