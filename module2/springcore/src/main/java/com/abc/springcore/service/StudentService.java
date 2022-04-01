package com.abc.springcore.service;

import com.abc.springcore.beans.Address;
import com.abc.springcore.beans.Student;

public class StudentService {

	private Student student;

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	
	public void displayStudentDetails() {
		System.out.println("StudentId: "+student.getStudentId());
		System.out.println("Name: "+student.getStudentName());
		System.out.println("Courses: "+student.getCourses());
		
		System.out.println("Address:");
		
		Address address = student.getAddress();
		
		System.out.println("DoorNo: "+address.getDoorNo());
		System.out.println("City: "+address.getCity());
		System.out.println("Pincode: "+address.getPincode());
		
	}
}
