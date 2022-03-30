package com.abc.bankapp.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.abc.bankapp.bean.Customer;
import com.abc.bankapp.service.CustomerService;

public class CustomerMain {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer name: ");
		String customerName = sc.next();

		System.out.println("Enter Customer email: ");
		String customerEmail = sc.next();

		// read the date in string format
		System.out.println("Enter Customer DOB (yyyy-mm-dd):");
		String dob = sc.next();
		
		sc.close();
		
		// convert string format date to LocalDate
		LocalDate localDate = LocalDate.parse(dob);
		
		
		Customer customer = new Customer(); 
		customer.setCustomerName(customerName);
		customer.setEmail(customerEmail);
		customer.setDob(localDate);	
		
		CustomerService customerService = new CustomerService();
		customerService.addCustomer(customer);
		System.out.println("Customer Saved.");
		
		
	}

}
