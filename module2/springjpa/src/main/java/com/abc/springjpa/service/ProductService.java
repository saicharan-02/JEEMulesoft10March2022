package com.abc.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.springjpa.dao.ProductDao;
import com.abc.springjpa.entity.Product;
import com.abc.springjpa.exception.ProductNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Transactional
	public void saveProduct(Product product) {		
		//any logics goes here
		productDao.save(product);		
	}
	
	public Product fetchProductById(int productId) throws ProductNotFoundException {
		Product product = productDao.getProductById(productId);
		if(product == null) {
			throw new ProductNotFoundException("Product not existing with id: "+productId);
		}		
		return product;
	}
	
	@Transactional
	public void removeProduct(int productId) {		
		Product product = productDao.getProductById(productId);
		if(product == null) {
			throw new ProductNotFoundException("Product not existing with id: "+productId);
		}		
		productDao.deleteProduct(product);			
	}	
	
	public List<Product> fetchAllProducts() {
		List<Product> products = productDao.getAllProducts();		
		return products;		
	}	
	
}
