package com.abc.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.springjpa.entity.Product;
import com.abc.springjpa.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

//	public void setProductService(ProductService productService) {
//		this.productService = productService;
//	}
	
	public void addProduct(Product product) {
		//validation logic and req processing logic goes here
		productService.saveProduct(product);
		System.out.println("Product saved.");
	}
}
