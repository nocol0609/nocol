package com.test_04;

public class Account {
	protected double balance; // ���

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean deposit(double amount) {//amountΪ������
		return true;
	}
	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		} else {
			return true;
		}
	}
}
