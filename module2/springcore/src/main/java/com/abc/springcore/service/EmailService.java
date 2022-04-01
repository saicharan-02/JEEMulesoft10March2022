package com.abc.springcore.service;

public class EmailService {

	private String body;
	private String from;
	private String to;
	
	public EmailService(String body, String from, String to) {
		super();
		this.body = body;
		this.from = from;
		this.to = to;
	}	
	
	public void sendEmail() {
		System.out.println("From : "+from);
		System.out.println("To : "+to);
		System.out.println("Body : "+body);
	}	
	
}
