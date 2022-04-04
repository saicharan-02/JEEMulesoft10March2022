package com.abc.springannotationapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

import com.abc.springannotationapp.bean.Account;

@Repository
public class AccountDao {

	private List<Account> accounts;
	
	public AccountDao() {
		System.out.println("Constructor initializtion .... ");	
		accounts = new ArrayList<>();
	}

	@PostConstruct
	private void postConstruct() {
		
		System.out.println("PostConstruct called.... ");	

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
		// todo

		return null;

	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestory called.... ");
		accounts = null;
	}
}
