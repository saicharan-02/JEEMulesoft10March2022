package com.abc.bankapp.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.abc.bankapp.bean.Customer;
import com.abc.bankapp.service.CustomerService;

public class CustomerMain {
	
	public void getCustomerDetails() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer id: ");
		int customerId = sc.nextInt();
		
		sc.close();
		
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.getCustomerDetails(customerId);
		
		if(customer!=null) {
			System.out.println("Name: "+customer.getCustomerName());
			System.out.println("Email: "+customer.getEmail());
			System.out.println("Dob: "+customer.getDob());
		}
		else {
			System.out.println("Customer not existing with id: "+customerId);
		}
		
	}
	
	
	public void saveCustomer() {
		
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
	

	public static void main(String[] args) {		
		
		
		CustomerMain customerMain = new CustomerMain();
		
		//customerMain.saveCustomer();
		
		customerMain.getCustomerDetails();
		
	}

}
