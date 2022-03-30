package com.abc.main;

import java.util.ArrayList;

import com.abc.bean.Account;

public class Bank {
	
	private ArrayList<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
		
		Account acc1 = new Account(111,"Raj", 50000);
		Account acc2 = new Account(222,"Krish", 60000);
		Account acc3 = new Account(333,"Aman", 40000);
		Account acc4 = new Account(444,"Charan", 55000);
		
		accounts.add(acc1);
		accounts.add(acc4);
		accounts.add(acc2);
		accounts.add(acc3);
	}

	public Account findAccount(int accno) {
		
		// todo
		return null;
		
	}
}
