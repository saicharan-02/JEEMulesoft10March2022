package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.entity.Product;

//@Repository 
public interface ProductRepository extends JpaRepository<Product,Integer> {

	

}
