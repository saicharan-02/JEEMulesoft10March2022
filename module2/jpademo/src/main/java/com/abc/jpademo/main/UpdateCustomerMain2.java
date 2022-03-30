package com.abc.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Customer;

public class UpdateCustomerMain2 {

	public static void main(String[] args) {
		
		int customerId = 2;
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Customer existingCustomer = em.find(Customer.class, customerId );
		
		if(existingCustomer!=null) {
			
			em.getTransaction().begin();

			existingCustomer.setCustomerName("newName");

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
