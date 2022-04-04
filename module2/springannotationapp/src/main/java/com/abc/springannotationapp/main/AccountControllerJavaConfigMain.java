package com.abc.springannotationapp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.springannotationapp.bean.Account;
import com.abc.springannotationapp.config.AppConfig;
import com.abc.springannotationapp.controller.AccountController;

public class AccountControllerJavaConfigMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AccountController accountController = context.getBean(AccountController.class);
		
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
