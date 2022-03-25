package com.abc.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeListDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpno(1001);
		emp1.setName("ccc");
		emp1.setSalary(42000);
		emp1.setDeptName("IT");
		emp1.setDateOfJoining(LocalDate.of(2020, 10, 10));
		
		Employee emp2 = new Employee();
		emp2.setEmpno(1004);
		emp2.setName("aaa");
		emp2.setSalary(65000);
		emp2.setDeptName("HR");
		emp2.setDateOfJoining(LocalDate.of(2021, 10, 10));
		
		Employee emp3 = new Employee();
		emp3.setEmpno(1003);
		emp3.setName("ddd");
		emp3.setSalary(50000);
		emp3.setDeptName("IT");
		emp3.setDateOfJoining(LocalDate.of(2019, 10, 10));
		
		Employee emp4 = new Employee();
		emp4.setEmpno(1002);
		emp4.setName("bbb");
		emp4.setSalary(75000);
		emp4.setDeptName("Sales");
		emp4.setDateOfJoining(LocalDate.of(2012, 10, 10));
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		System.out.println("****All Employees*****");
		
		empList.forEach(e->System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getDeptName()+" "+e.getDateOfJoining()));
				
		System.out.println("*****Employees working in IT Dept*******");
		
//		Iterator<Employee> i = empList.iterator();
//		while(i.hasNext()) {
//			Employee e = i.next();
//			if(e.getDeptName().equals("IT")) {
//				System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getDeptName()+" "+e.getDateOfJoining());
//			}
//		}
		
		empList.stream().filter(e-> e.getDeptName().equals("IT")).forEach(e->System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getDeptName()+" "+e.getDateOfJoining()));
		
		
		System.out.println("*****Employees working in IT Dept storing in separate list*******");
		
//		Iterator<Employee> i = empList.iterator();		
//		List<Employee> itEmps = new ArrayList<>();		
//		while(i.hasNext()) {
//			Employee e = i.next();
//			if(e.getDeptName().equals("IT")) {
//				itEmps.add(e);
//			}
//		}		
		
		List<Employee> itEmps = empList.stream().filter(e-> e.getDeptName().equals("IT")).collect(Collectors.toList());
		

		
		System.out.println("*****Storing employees salary in separate list*******");		
		
//		Iterator<Employee> i = empList.iterator();			
//		List<Double> empSalList = new ArrayList<>();		
//		while(i.hasNext()) {
//			Employee e = i.next();			
//			empSalList.add(e.getSalary());			
//		}
		
		List<Double> empSalList= empList.stream().map(x->x.getSalary()).collect(Collectors.toList());
		
		empSalList.forEach(s-> System.out.println(s));
		
		System.out.println("*****Max salary******");	
		
		OptionalDouble  maxSalary = empList.stream().mapToDouble(x->x.getSalary()).max();
		System.out.println(maxSalary.getAsDouble());
	}

}
