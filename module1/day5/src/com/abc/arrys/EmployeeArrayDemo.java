package com.abc.arrys;

import java.util.Arrays;
import java.util.Scanner;

import com.abc.bean.Employee;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpno(111);
		e1.setName("aaa");
		e1.setSalary(65000);
		
		Employee e2 = new Employee();
		e2.setEmpno(222);
		e2.setName("bbb");
		e2.setSalary(58000);
		
		Employee e3 = new Employee();
		e3.setEmpno(333);
		e3.setName("ccc");
		e3.setSalary(18000);
		
		Employee e4 = new Employee();
		e4.setEmpno(444);
		e4.setName("ddd");
		e4.setSalary(50000);
		
		Employee[] emps = new Employee[4];
		
		emps[0] = e1;		
		emps[1] = e2;
		emps[2] = e3;
		emps[3] = e4;
	
		
		System.out.println("*******Employee Data********");
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i].getEmpno()+" "+emps[i].getName()+" "+emps[i].getSalary());
		}
		
		System.out.println("*******Search Employee********");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empno");
		int eno = sc.nextInt();
		sc.close();
		
		boolean flag = false;
		for(Employee e : emps) {
			if(e.getEmpno() == eno) {
				System.out.println("Name:"+e.getName());
				System.out.println("Salary:"+e.getSalary());
				flag = true;
				break;
			}
		}		
		if(flag == false) {
			System.out.println("Employee not exising..");
		}	

	}

}
