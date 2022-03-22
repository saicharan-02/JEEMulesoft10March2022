package com.abc.main;

import java.util.Comparator;

import com.abc.bean.Account;

public class NumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		int result = o1.getAccno()-o2.getAccno();
		return result;
	}

}
