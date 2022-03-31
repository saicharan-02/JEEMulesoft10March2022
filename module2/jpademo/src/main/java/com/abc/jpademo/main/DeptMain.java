package com.abc.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Department;

public class DeptMain {

	public static void main(String[] args) {
		
		Department dept1 = new Department();
		dept1.setDeptId(10);
		dept1.setDeptName("HR");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(dept1);
		
		em.getTransaction().commit();
		System.out.println("Dept saved.");
		
		em.close();
		emf.close();

	}

}
