package com.abc.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abc.ecom.entity.Product;

//@Repository 
public interface ProductRepository extends JpaRepository<Product,Integer> {

	

}
