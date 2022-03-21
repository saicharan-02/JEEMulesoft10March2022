package com.abc.bean;

public class SavingAccount extends Account{
	
	private double interest;

	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
		this.interest = 5.5;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}	

}
