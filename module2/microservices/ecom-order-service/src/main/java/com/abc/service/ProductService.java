package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.model.Product;

@Service
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;

	public Product getProductDetails(int productId) {
		
		ResponseEntity<Product> responseEntity = restTemplate.getForEntity("http://product-service/product/get/" + productId, Product.class);
		Product product = responseEntity.getBody();
		return product;
	}
}
