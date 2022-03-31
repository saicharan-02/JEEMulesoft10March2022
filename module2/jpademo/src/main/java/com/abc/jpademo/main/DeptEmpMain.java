package com.abc.jpademo.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Department;
import com.abc.jpademo.entity.Employee;

public class DeptEmpMain {

	public static void main(String[] args) {
		
		Department dept1 = new Department();
		dept1.setDeptId(20);
		dept1.setDeptName("Hyd");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(111);
		emp1.setName("aaa");
		emp1.setSalary(50000);
		emp1.setDept(dept1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(222);
		emp2.setName("bbb");
		emp2.setSalary(60000);
		emp2.setDept(dept1);
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		
		dept1.setEmployees(emps);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(dept1);
		
		//em.persist(emp1);
		//em.persist(emp2);
		
		em.getTransaction().commit();
		System.out.println("done");
		
		em.close();
		emf.close();
	}

}
