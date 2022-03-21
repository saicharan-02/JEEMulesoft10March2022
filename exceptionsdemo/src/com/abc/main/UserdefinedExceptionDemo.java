package com.abc.main;

import java.util.Scanner;

import com.abc.exceptions.AgeLimitException;

public class UserdefinedExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Main Starts...");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.close();
		
		try {
			isEligibleForVote(age);
		}
		catch(AgeLimitException e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}		

		System.out.println("Main ends...");

	}
	
	static void isEligibleForVote(int age) throws AgeLimitException {
		
		if (age < 18) {
			// NullPointerException ex = new NullPointerException(); // unchecked exception
			//ClassNotFoundException ex = new ClassNotFoundException(); // checked exception
			AgeLimitException ex = new AgeLimitException("Not eligible for vote");
			throw ex;
		} else {
			System.out.println("Eligible for vote");
		}
	}

}
