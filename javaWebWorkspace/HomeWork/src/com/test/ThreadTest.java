package com.test;


class MyThread extends Thread{
	private int data;//成员变量且未加锁，每个线程开始得到date的初始值都为0
	public void run(){
		data += 2;
		System.out.print(data + " ");
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("konoooo");
	}
}
