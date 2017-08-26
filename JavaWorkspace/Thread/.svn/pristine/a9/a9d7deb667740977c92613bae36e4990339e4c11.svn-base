package com.test;

class StaticThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Account.testA(100);
		System.out.println(getName()+"加上100之后的值："+Account.getA());
	}
	
}


public class StaticSynTest {
	public static void main(String[] args) {
		StaticThread st1=new StaticThread();
		StaticThread st2=new StaticThread();
		
		st1.start();
		st2.start();
		
		try {
			st1.join();
			st2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("两个线程修改A之后的结果："+Account.getA());
	}
}
