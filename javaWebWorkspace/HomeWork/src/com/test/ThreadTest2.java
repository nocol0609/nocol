package com.test;

class MyValue {

	static int data;// 成员变量

	public void m() {
		int result = 0;// 每个线程运行时调用m()方法时result的初始值都为0
		result += 2;
		data += 2;
		System.out.println(result + " " + data);
	}
}

class MyThread1 extends Thread {
	private MyValue mv;

	public MyThread1(MyValue mv) {
		this.mv = mv;
	}

	public void run() {
		synchronized (mv) { // 若未加锁会出现好多种情况
			mv.m();
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		MyValue mv = new MyValue();
		Thread t1 = new MyThread1(mv);
		Thread t2 = new MyThread1(mv);
		Thread t3 = new MyThread1(mv);
		t1.start();
		t2.start();
		t3.start();
	}
}
