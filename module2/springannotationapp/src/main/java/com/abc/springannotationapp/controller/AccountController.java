package com.abc.springannotationapp.controller;

import java.util.List;

import com.abc.springannotationapp.bean.Account;
import com.abc.springannotationapp.service.AccountService;

public class AccountController {

	private AccountService accountService;	

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public void saveAccount(Account account) {		
		accountService.addAccount(account);
		System.out.println("Account added.");
	}
	
	public void dispalyAllAccounts() {
		
		List<Account> accounts = accountService.fetchAllAccounts();
		accounts.forEach(a->System.out.println(a.getAccno()+" "+a.getName()+" "+a.getBalance()));
		
	}
	
	public void searchAccountByAccno(int accno) {
		//todo
	}
}
