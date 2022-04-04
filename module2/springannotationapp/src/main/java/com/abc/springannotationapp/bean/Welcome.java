package com.abc.springannotationapp.bean;

public class Welcome {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHi() {
		System.out.println("Hello "+message);
	}	
	
}
