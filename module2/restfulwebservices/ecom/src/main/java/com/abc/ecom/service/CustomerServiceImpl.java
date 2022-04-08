package com.abc.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecom.entity.Customer;
import com.abc.ecom.exception.ResourceNotFoundException;
import com.abc.ecom.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if (optionalCustomer.isEmpty())
			throw new ResourceNotFoundException("Customer Not found with id : " + customerId);
		Customer customer = optionalCustomer.get();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer updateCustomer = getCustomerById(customer.getCustomerId());
		updateCustomer = customerRepository.save(customer);
		return updateCustomer;
	}

	@Override
	public void deleteCustomerById(int customerId) {
		Customer customer = getCustomerById(customerId);
		customerRepository.delete(customer);
	}

}
