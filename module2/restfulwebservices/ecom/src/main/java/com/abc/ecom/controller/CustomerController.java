package com.abc.ecom.controller;

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

import com.abc.ecom.entity.Customer;
import com.abc.ecom.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// @RequestMapping(value = "/customers",method = RequestMethod.GET)
	@GetMapping("/all")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("id") int customerId) {

		ResponseEntity<Object> responseEntity = null;
		Customer customer = customerService.getCustomerById(customerId);
		responseEntity = new ResponseEntity<>(customer, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCustomerById(@PathVariable("id") int customerId) {

		ResponseEntity<Object> responseEntity = null;
		customerService.deleteCustomerById(customerId);
		responseEntity = new ResponseEntity<>("Customer data deleted successfully", HttpStatus.OK);
		return responseEntity;
	}

	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {

		ResponseEntity<Customer> responseEntity = null;
		Customer saveCustomer = customerService.saveCustomer(customer);
		responseEntity = new ResponseEntity<>(saveCustomer, HttpStatus.CREATED);
		return responseEntity;
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) {

		ResponseEntity<Object> responseEntity = null;
		Customer updateCustomer = customerService.updateCustomer(customer);
		responseEntity = new ResponseEntity<>(updateCustomer, HttpStatus.OK);
		return responseEntity;
	}

}
