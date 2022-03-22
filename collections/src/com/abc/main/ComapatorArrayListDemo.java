package com.abc.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.abc.bean.Account;

public class ComapatorArrayListDemo {

	public static void main(String[] args) {
		
		Account acc1 = new Account(111,"Raj", 50000);
		Account acc2 = new Account(222,"Krish", 60000);
		Account acc3 = new Account(333,"Aman", 40000);
		Account acc4 = new Account(444,"Charan", 55000);
		
		ArrayList<Account>  accounts = new ArrayList<>();		
		accounts.add(acc1);
		accounts.add(acc4);
		accounts.add(acc2);
		accounts.add(acc3);
		
        NumberComparator numberComparator = new NumberComparator();
		
		NameComparator nameComparator = new NameComparator();
		
	    Collections.sort(accounts, nameComparator);
	  		
		Iterator<Account> i = accounts.iterator();
		while(i.hasNext()) {
			Account account = i.next();				
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}


	}

}
