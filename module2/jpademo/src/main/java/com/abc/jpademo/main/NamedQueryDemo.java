package com.abc.jpademo.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.abc.jpademo.entity.Customer;

public class NamedQueryDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
				
		TypedQuery<Customer> query1 = em.createNamedQuery("getAllCustomerQuery", Customer.class);
		List<Customer> customerList = query1.getResultList();
		customerList.forEach(c-> System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getEmail()+" "+c.getDob()));

		String inputName = "krish";
		TypedQuery<Customer> query2 = em.createNamedQuery("getCustomerByNameQuery", Customer.class);
		query2.setParameter("cname", inputName);		
		Customer customer = query2.getSingleResult();
		
		System.out.println("Name: "+customer.getCustomerName());
		System.out.println("Email: "+customer.getEmail());
		System.out.println("Dob: "+customer.getDob());
				
		em.close();
		emf.close();	

	}

}
