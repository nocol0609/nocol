package com.test;

class Computation implements Runnable {
	static int result;
	public Computation() {
	}
	public void run() {
		countprint(this.result);//该result是局部变量的result而不是成员变量的
	}
	public synchronized void countprint(int result) {
		result = result + 2;//每个线程运行时调用countprint()方法时result初始值都为0
		System.out.println(result + " ");
	}
}
public class ThreadTest3 {
	public static void main(String[] args) {
		
		Computation target = new Computation();
		new Thread(target).start();
		new Thread(target).start();
		new Thread(target).start();
		new Thread(target).start();
		System.out.println(target.result);//0
	}
}
