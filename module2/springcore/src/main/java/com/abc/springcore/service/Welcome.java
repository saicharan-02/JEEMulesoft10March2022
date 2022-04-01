package com.abc.springcore.service;

public class Welcome {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Hello, "+message);
	}	
	
}
