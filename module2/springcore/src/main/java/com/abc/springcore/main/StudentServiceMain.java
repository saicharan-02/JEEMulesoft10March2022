package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.service.StudentService;

public class StudentServiceMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		
		StudentService service = (StudentService) context.getBean("stuService");
		
		service.displayStudentDetails();
		
		context.close();

	}

}
