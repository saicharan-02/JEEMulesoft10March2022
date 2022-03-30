package com.abc.main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.abc.bean.Product;

public class ProductMapDemo {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setProductId(10);
		product1.setProductName("Iphone");
		product1.setProductPrice(690000);
		product1.setCreatedAt(LocalDate.of(2020, 10, 30));
		
		Product product2 = new Product();
		product2.setProductId(20);
		product2.setProductName("Nokia");
		product2.setProductPrice(290000);
		product2.setCreatedAt(LocalDate.of(2021, 10, 30));
		
		Product product3 = new Product();
		product3.setProductId(30);
		product3.setProductName("Samsung");
		product3.setProductPrice(490000);
		product3.setCreatedAt(LocalDate.of(2020, 10, 30));
		
		Product product4 = new Product();
		product4.setProductId(40);
		product4.setProductName("Oppo");
		product4.setProductPrice(490000);
		product4.setCreatedAt(LocalDate.of(2020, 10, 30));
		
		Map<Integer,Product> productMap = new HashMap<>();
		
		productMap.put(10, product1);
		productMap.put(20, product2);
		productMap.put(30, product3);
		productMap.put(40, product4);
		
		System.out.println(productMap);
		
		int input = 40;
		
		Product product = productMap.get(input);
		
		if(product!=null) {
			System.out.println("Name: "+product.getProductName());
			System.out.println("Price: "+product.getProductPrice());
			System.out.println("Created on: "+product.getCreatedAt());
		}
		else {
			System.out.println("not existing...");
		}

	}

}
