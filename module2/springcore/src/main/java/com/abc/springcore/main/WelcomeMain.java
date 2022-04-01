package com.abc.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.service.Welcome;

public class WelcomeMain {

	public static void main(String[] args) {
		
		//Welcome welcome = new Welcome();
		//welcome.setMessage("spring is great");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");		
		Welcome welcome = (Welcome) context.getBean("hello");		
		
		welcome.sayHello();
		
	}
}
