package com.abc.bean;

public class Account implements Comparable<Account> {

	private int accno;
	private String name;
	private double balance;
	
	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public int compareTo(Account o) {
		int result = this.accno - o.accno;
		System.out.println(result);
		//int result = this.name.compareTo(o.getName());
		return result;
	}

}
