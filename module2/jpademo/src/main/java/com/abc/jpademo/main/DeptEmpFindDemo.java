package com.abc.jpademo.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Department;
import com.abc.jpademo.entity.Employee;

public class DeptEmpFindDemo {

	public static void main(String[] args) {
		
		int input = 10;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		
		Department dept = em.find(Department.class, input);
		
		if(dept!=null) {
			
			String deptname = dept.getDeptName();
			
			System.out.println("Deptartment Name: "+deptname);
			
			List<Employee> emps = dept.getEmployees();
			
			System.out.println("Employee in this dept: ");
			
			emps.forEach(e->System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary()));	
			
			
		}
		
		em.close();
		emf.close();

	}

}
