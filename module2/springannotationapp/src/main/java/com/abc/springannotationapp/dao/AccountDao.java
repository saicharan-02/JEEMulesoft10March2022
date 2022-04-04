package com.abc.springannotationapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.abc.springannotationapp.bean.Account;

public class AccountDao {

	private List<Account> accounts;
	
	public AccountDao() {
		accounts = new ArrayList<>();
		
		Account account1 = new Account();
		account1.setAccno(111);
		account1.setName("dummy1");
		account1.setBalance(10000);
		
		Account account2 = new Account();
		account2.setAccno(222);
		account2.setName("dummy2");
		account2.setBalance(20000);
		
		accounts.add(account2);
		accounts.add(account1);		
		
	}
	
	public void saveAccount(Account account) {
		accounts.add(account);
	}
	
	public List<Account> getAllAccounts() {
		return accounts;
	}
	
	public Account getAccountByAccno(int accno) {
		//todo
		
		return null;
		
	}
}
