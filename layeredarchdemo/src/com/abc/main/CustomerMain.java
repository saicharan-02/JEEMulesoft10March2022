package com.abc.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.abc.bean.Customer;
import com.abc.dao.CustomerDao;

public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter Customer name: ");
//		String customerName = sc.next();
//
//		System.out.println("Enter Customer email: ");
//		String customerEmail = sc.next();
//
//		// read the date in string format
//		System.out.println("Enter Customer DOB (yyyy-mm-dd):");
//		String dob = sc.next();
//		
//		// convert string format date to LocalDate
//		LocalDate localDate = LocalDate.parse(dob);
//
//		
//		
//		Customer customer = new Customer(); 
//		customer.setCustomerName(customerName);
//		customer.setEmail(customerEmail);
//		customer.setDob(localDate);		
//		
//		CustomerDao customerDao = new CustomerDao();		
//		customerDao.saveCustomer(customer); 
//		
//		System.out.println("Customer Saved.");	
		
		
		System.out.println("Enter Customer Id: ");		
		int customerId = sc.nextInt();
		
		CustomerDao customerDao = new CustomerDao();
		
		Customer customer = customerDao.findCustomerById(customerId);
		
		if(customer!=null) {
			
			System.out.println("Id: "+customer.getCustomerId());
			System.out.println("Name: "+customer.getCustomerName());
			System.out.println("Dob: "+customer.getDob());
			System.out.println("Email: "+customer.getEmail());
		}
		else {
			System.out.println("Customer not existing with id: "+customerId);
		}	
		

	}

}
