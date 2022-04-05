package com.abc.springjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
		return product;		
	}
	
	public List<Product> getAllProducts() {		
		TypedQuery<Product> query = entityManager.createNamedQuery("getAllProductsQuery", Product.class);
		List<Product> products = query.getResultList();
		return products;
	}
	
	public void deleteProduct(Product product) {		
		entityManager.remove(product);
	}
}
