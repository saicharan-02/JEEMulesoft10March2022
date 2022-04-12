package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Product;
import com.abc.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/all")
	public List<Product> fetchAllProducts() {

		List<Product> products = productService.getAllProducts();
		return products;
	}

	@PostMapping("/save")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {

		Product newProduct = productService.saveProduct(product);
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(newProduct, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> fetchProductById(@PathVariable("id") int productId) {

		ResponseEntity<?> responseEntity = null;
		Product product = productService.getProductById(productId);
		responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable("id") int productId) {

		ResponseEntity<String> responseEntity = null;
		productService.deleteProduct(productId);
		responseEntity = new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
		return responseEntity;
	}

	@PutMapping("/update")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product) {

		ResponseEntity<Object> responseEntity = null;
		Product updatedProduct = productService.updateProduct(product);
		responseEntity = new ResponseEntity<>(updatedProduct, HttpStatus.OK);
		return responseEntity;
	}

}
