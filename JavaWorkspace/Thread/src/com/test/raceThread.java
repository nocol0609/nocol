package com.test;

public class raceThread extends Thread {
	
	static boolean flag=false;
	
	public raceThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <=100; i++) {
			if(flag){
				break;
			}
			System.out.println(getName()+"跑了"+i+"米");
		}
		flag=true;
	}
	
	public static void main(String[] args) {
		raceThread t1=new raceThread("乌龟");
		raceThread t2=new raceThread("兔子");
		System.out.println(Thread.currentThread().getName()+"比赛开始：");
		t1.start();
		t2.start();
		try {
			//Thread.sleep(1000);
			t1.join();
			t2.join();  //主线程等待两线程结束后再执行
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"比赛结束!");
	}
}
