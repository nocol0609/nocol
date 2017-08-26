package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 线程休眠
 *		public static void sleep(long millis)
 */
class ThreadSleep extends Thread{
	@Override
	public void run() {
		for(int x=1;x<101;x++){
			System.out.println(getName()+":"+x);
			
			try {
				Thread.sleep(1000);//休息1秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Thread_Sleep {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();

		ts1.setName("大傻子");
		ts2.setName("大帅比");
		ts3.setName("二傻子");

		ts1.start();
		ts2.start();
		ts3.start();
	}
}
