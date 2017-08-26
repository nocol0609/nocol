package com.test_04;

public class Bank {
	private Customer[] customers = new Customer[10];
	private int custNum;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(Customer[] customers, int custNum) {
		super();
		this.customers = customers;
		this.custNum = custNum;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustNum() {
		return custNum;
	}

	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}

	public void addCustomer(Customer customer) {

		for (int index = 0; index <= custNum - 1; index++) {
			customers[index] = customer;
		}

		// customers[custNum] = customer;
		// custNum++;

		// customers = new Customer[custNum];
		// for (int i = 0; i < custNum; i++) {
		// customers[i] = new Customer();
		// }

	}

	public Customer getCustomer(int index) {// 获取指定位置的客户
		return customers[index];
	}

	public int getCustomerNum() {
		return custNum;
	}
}
