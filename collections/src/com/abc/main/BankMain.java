package com.abc.main;

import com.abc.bean.Account;

public class BankMain {

	public static void main(String[] args) {
		
		int inputAccno = 102;
		
		Bank bank = new Bank();
		
		Account account = bank.findAccount(inputAccno);
		
		if(account != null) {
			//todo - display account details i.e name and balance
			
		}
		else {
			System.out.println("A/c is not existing with accno : "+inputAccno);
		}

	}

}
