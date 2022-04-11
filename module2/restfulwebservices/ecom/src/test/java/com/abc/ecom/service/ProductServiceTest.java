package com.abc.ecom.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.abc.ecom.entity.Product;
import com.abc.ecom.exception.ResourceNotFoundException;
import com.abc.ecom.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTest {
	
	@Mock
	private ProductRepository productRepository;

	@InjectMocks
	private ProductServiceImpl productServiceImpl;	
	
	@Test 
	public void testGetProductById() {
		
		Product product = new Product();
		product.setProductId(101);
		product.setProductName("Pname");
		product.setProductPrice(50000);
		product.setCreatedOn(LocalDate.of(2022,10, 10));
		product.setCategory("Mobile");
		
		Optional<Product> optionalProduct = Optional.of(product);
		
		when(productRepository.findById(101)).thenReturn(optionalProduct);			
		
		Product actualProduct = productServiceImpl.getProductById(101);
		
		Product expectedProduct = optionalProduct.get();
		
		assertEquals(expectedProduct.getProductName(),actualProduct.getProductName());		
		
	}
	
	@Test 
	public void testGetProductByIdThrowsException() {
		
		when(productRepository.findById(102)).thenThrow(ResourceNotFoundException.class);
		
		assertThrows(ResourceNotFoundException.class, () -> productServiceImpl.getProductById(102));
	}
	
	
	@Test 
	public void testSaveProduct() {
		
		Product product = new Product();	
		product.setProductId(111);
		product.setProductName("Pname");
		product.setProductPrice(50000);
		product.setCreatedOn(LocalDate.of(2022,10, 10));
		product.setCategory("Mobile");
		
		when(productRepository.save(product)).thenReturn(product);
		
		Product newProduct = productServiceImpl.saveProduct(product);
		
		assertEquals(product.getProductName(),newProduct.getProductName());
		assertEquals(product.getProductPrice(),newProduct.getProductPrice());
		assertEquals(product.getCategory(),newProduct.getCategory());
		
		//verify(productRepository,times(1)).save(product);
		
	}
	
	@Test
	public void testDeleteProduct() {
		
		Product product = new Product();	
		product.setProductId(111);
		product.setProductName("Pname");
		product.setProductPrice(50000);
		product.setCreatedOn(LocalDate.of(2022,10, 10));
		product.setCategory("Mobile");
		
		Optional<Product> optionalProduct = Optional.of(product);
		
		when(productRepository.findById(111)).thenReturn(optionalProduct);
		
		doNothing().when(productRepository).delete(optionalProduct.get());
		
		productServiceImpl.deleteProduct(111);
		
		verify(productRepository,times(1)).findById(111);
		
		verify(productRepository,times(1)).delete(optionalProduct.get());
		
	}
	
	
}
