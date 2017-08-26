package com.test;

class DepositThread extends Thread{
	
	private Account account;
	

	public DepositThread(String name,Account account) {
		// TODO Auto-generated constructor stub
		super(name);
		this.account=account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		double atm = account.deposit(1000D);
		System.out.println(getName()+"存了"+atm+"钱");
	}

}

class WithdrawThread extends Thread{
	
	private Account account;

	public WithdrawThread(String name,Account account) {
		// TODO Auto-generated constructor stub
		super(name);
		this.account=account;
	}
	
	public void run() {
//		synchronized (WithdrawThread.class) {
//			double atm = account.withdraw(1000D);
//			System.out.println(getName()+"取了"+atm+"钱");
//		}
		
		//withdraw()加锁
		double atm = account.withdraw(1000D);
		System.out.println(getName()+"取了"+atm+"钱");
				
	}
}

public class AccountThread {
	public static void main(String[] args) {
		
		Account account=new Account(1L, 1000D);
		System.out.println("当前账户"+account.getId()+"余额为"+account.getBalance());
		DepositThread mom=new DepositThread("mm",account);
		DepositThread son=new DepositThread("son",account);
		
		mom.start();
		son.start();
		
		try {
			mom.join();
			son.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("当前账户"+account.getId()+"余额为"+account.getBalance());
		
/*		
		Account account=new Account(1L, 1000);
		System.out.println("当前账户"+account.getId()+"余额为"+account.getBalance());
		WithdrawThread mom=new WithdrawThread("mm",account);
		WithdrawThread son=new WithdrawThread("son",account);
		
		mom.start();
		son.start();
		
		try {
			mom.join();
			son.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("当前账户"+account.getId()+"余额为"+account.getBalance());*/
	}
}
