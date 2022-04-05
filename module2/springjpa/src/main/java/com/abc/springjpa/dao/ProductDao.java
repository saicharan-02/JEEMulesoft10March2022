package com.abc.springjpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.abc.springjpa.entity.Product;
import com.abc.springjpa.exception.ProductNotFoundException;

@Repository
public class ProductDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Product product) {		
		entityManager.persist(product);
	}
	
	public Product getProductById(int productId) throws ProductNotFoundException {		
		Product product = entityManager.find(Product.class, productId);		
		if(product == null) {
			throw new ProductNotFoundException("Product not existing with id: "+productId);
		}		
		return product;		
	}
}
