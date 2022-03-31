package com.abc.jpademo.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abc.jpademo.entity.Customer;

public class JpqlDemo {
	
public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("********Get All customers************");
		
		Query query1 = em.createQuery("select c from Customer c");		
		List<Customer> customerList = query1.getResultList();		
		customerList.forEach(c-> System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getEmail()+" "+c.getDob()));
		
		System.out.println("********Get Customer By Name************");
		
		try {
			String inputName = "krish";
			
			//using positional parameter
			//Query query2 = em.createQuery("select c from Customer c where customerName = ?1");
			//query2.setParameter(1, inputName);
			
			//using named parameter
			Query query2 = em.createQuery("select c from Customer c where c.customerName = :cname");
			query2.setParameter("cname", inputName);
			
			Customer customer = (Customer) query2.getSingleResult();
			
			System.out.println("Name: "+customer.getCustomerName());
			System.out.println("Email: "+customer.getEmail());
			System.out.println("Dob: "+customer.getDob());
		}
		catch(Exception e) {
			System.out.println("No Customer is available");
		}
				
		
		em.close();
		emf.close();	
	}

}
