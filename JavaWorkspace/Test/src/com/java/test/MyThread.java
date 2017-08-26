package com.java.test;

public class MyThread extends Thread {
	
	private static int num;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized(this.getClass()){
				num++;
				System.out.println("num="+num);
				if(num==5){
					try{
						wait();
					}catch(Exception e){
						e.printStackTrace();
					}
				}//if代码块结束
			}//synchronized代码块结束
			notify(); 
		}//for代码块结束
	}//run代码块结束 
	public static void main(String[] args) {
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t2.start();
	}
	
}

