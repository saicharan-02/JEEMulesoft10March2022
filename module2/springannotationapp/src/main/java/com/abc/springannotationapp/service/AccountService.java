package com.abc.springannotationapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.springannotationapp.bean.Account;
import com.abc.springannotationapp.dao.AccountDao;

public class AccountService {
	
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void  addAccount(Account account) {
		
		accountDao.saveAccount(account);
		
	}
	
	public List<Account> fetchAllAccounts() {
	
		List<Account> accounts = accountDao.getAllAccounts();
		return accounts;
		
	}
	
	public Account fetchAccountByAccno(int accno) {
		
		return null;
		
	}
}
