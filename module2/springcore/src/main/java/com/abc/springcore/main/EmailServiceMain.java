package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.service.EmailService;

public class EmailServiceMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		
		EmailService service = (EmailService) context.getBean("mailService");
		
		service.sendEmail();
		
		context.close();

	}

}
