package com.abc.service;

import java.util.List;

import com.abc.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public List<Customer> getAllCustomers();
	public Customer updateCustomer(Customer customer);
	public void deleteCustomerById(int customerId);
	
	// get all orders by customerId
}