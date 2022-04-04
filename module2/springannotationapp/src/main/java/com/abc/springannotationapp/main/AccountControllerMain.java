package com.abc.springannotationapp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springannotationapp.bean.Account;
import com.abc.springannotationapp.controller.AccountController;

public class AccountControllerMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		AccountController accountController = (AccountController) context.getBean("accController");
		
		Account account= new Account();
		account.setAccno(333);
		account.setName("dummy3");
		account.setBalance(30000);
		
		accountController.saveAccount(account);
		
		Account account2= new Account();
		account2.setAccno(444);
		account2.setName("dummy4");
		account2.setBalance(40000);
		
		accountController.saveAccount(account2);
		
		
		accountController.dispalyAllAccounts();
		
		context.close();

	}

}
