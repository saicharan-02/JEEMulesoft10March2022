package com.abc.jpademo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Customer;

public class CustomerDao {

	public void saveCustomer(Customer customer) {	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(customer);
		
		em.getTransaction().commit();
		
		System.out.println("customer saved");		
		
		em.close();
		emf.close();
	}
	
	public Customer getCustomerById(int customerId) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Customer customer = em.find(Customer.class, customerId);		
		
		em.close();
		emf.close();	
		
		return customer;
		
	}
	
	public void deleteCustomer(int customerId) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
	    Customer  customer = em.find(Customer.class, customerId);
	    
	    if(customer!=null) {
	    	
	    	em.getTransaction().begin();
	    	
	    	em.remove(customer);
	    	
	    	em.getTransaction().commit();
	    	
	    	System.out.println("Customer deleted with id: "+customerId);
	    }
	    else {
	    	System.out.println("Customer not existing...");
	    }
			
		em.close();
		emf.close();	
	}
	
	public void updateCustomer(Customer customer) {
		
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
