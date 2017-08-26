package com.thread_group_pool;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 线程组： 把多个线程组合到一起。 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 */
class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x = 0; x < 101; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}
}

public class Thread_Grounp {
	public static void main(String[] args) {
		method1();
		//写方法实现创建自己的线程组
		method2();
	}

	private static void method2() {
		//创建线程组对象
		ThreadGroup tg=new ThreadGroup("这是一个新的线程组");
		//创建字源对象
		MyRunnable my2=new MyRunnable();
		//创建线程对象，并将线程对象赋给新创建的线程组
		// Thread(ThreadGroup group, Runnable target, String name)
		Thread t1=new Thread(tg,my2,"大帅比"); 
		Thread t2=new Thread(tg,my2,"二傻子");
		//打印
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		//可将线程组内线程一并设置为守护线程
		tg.setDaemon(true);
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
		//创建资源对象
		MyRunnable my=new MyRunnable();
		//创建线程对象
		Thread t1=new Thread(my,"大帅比"); 
		Thread t2=new Thread(my,"二傻子");
		//调用方法得到当前线程所在的线程组
		//public final ThreadGroup getThreadGroup()
		ThreadGroup tg1=t1.getThreadGroup();
		ThreadGroup tg2=t2.getThreadGroup();
		//调用方法得到当前线程锁在线程组的名字
		//public final String getName()
		String name1=tg1.getName();
		String name2=tg2.getName();
		System.out.println(name1);//main
		System.out.println(name2);//main
		//打印main方法锁在线程组的名字
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
	}
}
