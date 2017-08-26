package com.test_04;

public class CheckingAccount extends Account {
	private double overdraft;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance) {
		super(balance);

	}

	public CheckingAccount(double balance, double overdraft) {
		super(balance);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public boolean withdraw(double amount) {
		if (amount > balance + overdraft) {
			return false;
		} else {
			return true;
		}
	}
}
