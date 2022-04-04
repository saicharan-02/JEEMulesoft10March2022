package com.abc.springannotationapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.springannotationapp.bean.Account;
import com.abc.springannotationapp.service.AccountService;

@Controller
public class AccountController {

	@Autowired
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
		accounts.forEach(a -> System.out.println(a.getAccno() + " " + a.getName() + " " + a.getBalance()));

	}

	public void searchAccountByAccno(int accno) {
		// todo
	}
}
