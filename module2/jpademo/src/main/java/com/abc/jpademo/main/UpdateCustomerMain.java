package com.abc.jpademo.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Customer;

public class UpdateCustomerMain {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCustomerId(4);
		customer.setCustomerName("Rajkumar");
		customer.setEmail("raj@tmail.com");
		customer.setDob(LocalDate.of(1998, 10, 10));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Customer existingCustomer = em.find(Customer.class, customer.getCustomerId());
		
		if(existingCustomer!=null) {
			
			em.getTransaction().begin();

			em.merge(customer);

			em.getTransaction().commit();

			System.out.println("customer updated");
		}
		else {
			System.out.println("customer not existing...");
		}	

		em.close();
		emf.close();

	}
}
