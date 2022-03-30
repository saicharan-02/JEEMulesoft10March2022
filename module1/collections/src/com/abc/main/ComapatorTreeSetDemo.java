package com.abc.main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.abc.bean.Account;

public class ComapatorTreeSetDemo {

	public static void main(String[] args) {
	
		Account acc1 = new Account(102,"Raj", 50000);
		Account acc2 = new Account(106,"Krish", 60000);
		Account acc3 = new Account(103,"Aman", 40000);
		Account acc4 = new Account(104,"Aman", 55000);		
		
		NumberComparator numberComparator = new NumberComparator();
		
		NameComparator nameComparator = new NameComparator();
		
		Set<Account> accounts = new TreeSet<>(nameComparator);
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
