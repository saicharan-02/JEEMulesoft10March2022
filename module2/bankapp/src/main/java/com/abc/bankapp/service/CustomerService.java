package com.abc.bankapp.service;

import com.abc.bankapp.bean.Customer;
import com.abc.bankapp.dao.CustomerDao;

public class CustomerService {

	public void addCustomer(Customer customer) {		
		//any business logic goes here
		
		CustomerDao customerDao = new CustomerDao();
		customerDao.saveCustomer(customer);		
		
	}
}
