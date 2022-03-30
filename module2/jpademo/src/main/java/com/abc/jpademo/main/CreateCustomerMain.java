package com.abc.jpademo.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Customer;

public class CreateCustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomerName("tillu");
		customer.setEmail("tillu@tmail.com");
		customer.setDob(LocalDate.of(1998, 10, 10));
		
		//how to persist customer object
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(customer);
		
		em.getTransaction().commit();
		
		System.out.println("customer saved");
		
		
		em.close();
		emf.close();
		
		

	}

}
