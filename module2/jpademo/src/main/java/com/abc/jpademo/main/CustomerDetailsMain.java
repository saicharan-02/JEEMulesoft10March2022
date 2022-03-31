package com.abc.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Customer;

public class CustomerDetailsMain {

	public static void main(String[] args) {		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		//1.get customer by id
		
		int customerId = 5;
		Customer customer = em.find(Customer.class, customerId);
		
		if(customer != null) {
			System.out.println("Name: "+customer.getCustomerName());
			System.out.println("Email: "+customer.getEmail());
			System.out.println("Dob: "+customer.getDob());
		}
		else {
			System.out.println("Customer not existing in the database");
		}
		
		
	}

}
