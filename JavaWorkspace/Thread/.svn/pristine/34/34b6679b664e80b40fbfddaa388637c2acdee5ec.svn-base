package com.test;

public class FirstThread extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
			System.out.println(getName() +"+"+i+"之后的结果：" + sum);
		}
	}

	public static void main(String[] args) {
		FirstThread thread1 = new FirstThread();
		FirstThread thread2 = new FirstThread();
		thread1.start();
		thread2.start();
	}
}
