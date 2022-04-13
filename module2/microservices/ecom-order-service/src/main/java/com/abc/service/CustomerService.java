package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.model.Customer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CustomerService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getCustomerDetailsFallback")	
	public Customer getCustomerDetails(int customerId) {
		
		ResponseEntity<Customer> responseEntity = restTemplate.getForEntity("http://customer-service/customer/get/" + customerId, Customer.class);
		Customer customer = responseEntity.getBody();
		return customer;
	}	
	
	public Customer getCustomerDetailsFallback(int customerId) {
		Customer customer = new Customer();
		customer.setCustomerId(0);
		customer.setCustomerName(null);
		customer.setEmail(null);
		customer.setMobile(null);
		return customer;		
	}
}
