package com.thread_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
 * 为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock。
 * 
 * Lock：
 * 		void lock()： 获取锁。
 * 		void unlock():释放锁。  
 * ReentrantLock是Lock的实现类.
 */
class MyRunnable implements Runnable{
	//定义票数
	private int tickets=100;
	//定义锁对象
	private Lock lock=new ReentrantLock();
	
	@Override
	public void run() {
		while(true){
			try{  //此处为带catch，防止内部代码出错，而导致不能释放锁
				//加锁
				lock.lock();
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}finally{
				//释放锁
				lock.unlock();
			}
		}
	}
}
public class SellTicketsDemo {
	public static void main(String[] args) {
		//创建资源对象
		MyRunnable my=new MyRunnable();
		//创建线程对象
		Thread t1=new Thread(my);
		Thread t2=new Thread(my);
		Thread t3=new Thread(my);
		
		//线程setName
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}
