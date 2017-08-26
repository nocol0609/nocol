package com.test;

public class Account {
	private Long id;
	private double balance;
	private static int A = 100;

	/* synchronized */ public static void testA(int a) {

		synchronized (Account.class) {//��̬�������������ǵ�ǰ����ֽ����ļ�����ǰclass�ļ���
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

	// ȡǮ
	/* synchronized */ public double withdraw(double atm) {

		if (atm < 0) {
			return 0;
		}

		// ͬ�������
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

	// ��Ǯ
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
