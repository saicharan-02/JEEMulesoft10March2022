package com.abc.springannotationapp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.springannotationapp.bean.Welcome;
import com.abc.springannotationapp.config.AppConfig;

public class WelcomeBeanMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Welcome welcome = (Welcome) context.getBean("hello");
		welcome.sayHi();

	}

}
