package com.abc.jpademo.main;

import com.abc.jpademo.dao.CustomerDao;
import com.abc.jpademo.entity.Customer;

public class FindCustomerMain {

	public static void main(String[] args) {
		
		int customerId = 5;
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
//		EntityManager em = emf.createEntityManager();
//		
//		Customer customer = em.find(Customer.class, customerId);
//		
//		if(customer != null) {
//			System.out.println("Name: "+customer.getCustomerName());
//			System.out.println("Email: "+customer.getEmail());
//			System.out.println("Dob: "+customer.getDob());
//		}
//		else {
//			System.out.println("Customer not existing in the database");
//		}
//		
//		em.close();
//		emf.close();	
		
		CustomerDao customerDao = new CustomerDao();
		Customer customer = customerDao.getCustomerById(customerId);
		
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
