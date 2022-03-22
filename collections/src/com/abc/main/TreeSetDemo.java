package com.abc.main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.abc.bean.Account;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> courses = new TreeSet<>();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("hibernate");		

		Iterator<String> i1 = courses.iterator();
		while(i1.hasNext()) {
			String c = i1.next();
			System.out.println(c);
		}
		
		
		Account acc1 = new Account(102,"Raj", 50000);
		Account acc2 = new Account(106,"Krish", 60000);
		Account acc3 = new Account(103,"Aman", 40000);
		Account acc4 = new Account(104,"Charan", 55000);		
		
		Set<Account> accounts = new TreeSet<>();
		accounts.add(acc1);
		accounts.add(acc4);
		accounts.add(acc2);
		accounts.add(acc3);
		
		Iterator<Account> i = accounts.iterator();
		while(i.hasNext()) {
			Account account = i.next();				
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}		
		
	}

}
