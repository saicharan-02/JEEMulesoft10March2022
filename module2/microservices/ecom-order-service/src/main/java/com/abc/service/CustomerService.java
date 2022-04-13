package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private RestTemplate restTemplate;

	public Customer getCustomerDetails(int customerId) {
		
		ResponseEntity<Customer> responseEntity = restTemplate.getForEntity("http://customer-service/customer/get/" + customerId, Customer.class);
		Customer customer = responseEntity.getBody();
		return customer;
	}
}
