package com.test;

public class Account {
	private Long id;
	private double balance;
	private static int A = 100;

	/* synchronized */ public static void testA(int a) {

		synchronized (Account.class) {//静态方法的锁对象是当前类的字节码文件（当前class文件）
			int temp = A;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			temp += a;
			A = temp;
		}
	}

	public Account(Long id, double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public static double getA() {
		return A;
	}

	// 取钱
	/* synchronized */ public double withdraw(double atm) {

		if (atm < 0) {
			return 0;
		}

		// 同步代码块
		synchronized (this) {
			double temp = this.balance;
			if (atm > temp) {
				return 0;
			}
			// try {
			// Thread.sleep(10);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

			temp -= atm;
			this.balance = temp;
		}

		return atm;
	}

	// 存钱
	public double deposit(double atm) {

		if (atm < 0) {
			return 0;
		}

		// try {
		// Thread.sleep(10);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		synchronized (this) {
			double temp = this.balance;
			temp += atm;
			this.balance = temp;
		}

		return atm;
	}

}
