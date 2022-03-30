package com.abc.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Customer;

public class DeleteCustomerMain {

	public static void main(String[] args) {
		
	int customerId = 9;
		
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

}
