package com.abc.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.springjpa.entity.Product;
import com.abc.springjpa.exception.ProductNotFoundException;
import com.abc.springjpa.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

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
	
	public void deleteProduct(int productId) {
		try {			
			productService.removeProduct(productId);
			System.out.println("product deleted");
		}
		catch(ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void fetchAllProducts() {
		List<Product> products = productService.fetchAllProducts();
		products.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()));
	}
}



