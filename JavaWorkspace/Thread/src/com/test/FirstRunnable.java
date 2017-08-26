package com.test;

public class FirstRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+"目前所在的位置:"+i);
		}
	}
	public static void main(String[] args) {
		FirstRunnable fr=new FirstRunnable();
		
		Thread t1=new Thread(fr);
		Thread t2=new Thread(fr);
		
		t1.start();
		t2.start();
	}
}
