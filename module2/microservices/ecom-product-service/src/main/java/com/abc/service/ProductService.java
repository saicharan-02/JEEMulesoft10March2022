package com.abc.service;

import java.util.List;

import com.abc.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public Product saveProduct(Product product);
	
	public Product getProductById(int productId);
	
	public void deleteProduct(int productId);
	
	public Product updateProduct(Product product);
}
