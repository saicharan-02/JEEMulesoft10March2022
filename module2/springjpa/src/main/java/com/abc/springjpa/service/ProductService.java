package com.abc.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.springjpa.dao.ProductDao;
import com.abc.springjpa.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

//	public void setProductDao(ProductDao productDao) {
//		this.productDao = productDao;
//	}
//	
	@Transactional
	public void saveProduct(Product product) {
		//any logics goes here
		productDao.save(product);	
		
	}
	
}
