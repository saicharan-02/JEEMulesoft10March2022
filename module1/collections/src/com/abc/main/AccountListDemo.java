package com.abc.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.abc.bean.Account;

public class AccountListDemo {

	public static void main(String[] args) {
		
		System.out.println("******Courses List********");
		
		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("hibernate");
		
//		for(String c : courses) {
//			System.out.println(c);
//		}		
		
		Collections.sort(courses);
		
		Iterator<String> i1 = courses.iterator();
		while(i1.hasNext()) {
			String c = i1.next();
			System.out.println(c);
		}
		
		
		
		System.out.println("******Account List********");
		
		Account acc1 = new Account(111,"Raj", 50000);
		Account acc2 = new Account(222,"Krish", 60000);
		Account acc3 = new Account(333,"Aman", 40000);
		Account acc4 = new Account(444,"Charan", 55000);
		
		ArrayList<Account>  accounts = new ArrayList<>();		
		accounts.add(acc1);
		accounts.add(acc4);
		accounts.add(acc2);
		accounts.add(acc3);
		
	    Collections.sort(accounts);
		
		Iterator<Account> i = accounts.iterator();
		while(i.hasNext()) {
			Account account = i.next();				
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}

	}

}
