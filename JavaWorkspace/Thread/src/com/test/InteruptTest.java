package com.test;

public class InteruptTest extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			/*System.out.println("1是否被中断："+isInterrupted()); //true   方法执行后保持状态
			System.out.println("2是否被中断："+isInterrupted());*/ //true
			
			System.out.println("1是否被中断："+interrupted());// true、方法执行后清空状态
			System.out.println("2是否被中断："+interrupted());//false
			
			Thread.sleep(1000);
			System.out.println("线程sleep()结束");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("线程被中断，当前现线程状态："+isInterrupted());
		}
	}
	public static void main(String[] args) {
		InteruptTest it=new InteruptTest();
		it.start();
		it.interrupt();
	}
}