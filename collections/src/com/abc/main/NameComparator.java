package com.abc.main;

import java.util.Comparator;

import com.abc.bean.Account;

public class NameComparator implements Comparator<Account> {
	
	@Override
	public int compare(Account o1, Account o2) {
	
		 if(o1.getName().equals(o2.getName())) {
			 return o1.getAccno()-o2.getAccno();
		 }
		
		return o1.getName().compareTo(o2.getName());
	}

}
