package com.nocol_03;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 实现Runnable接口的方式实现是三个窗口同时卖票
 */
/*
 * 如何解决线程安全问题呢?
 * 
 * 要想解决问题，就要知道哪些原因会导致出问题:(而且这些原因也是以后我们判断一个程序是否会有线程安全问题的标准)
 * A:是否是多线程环境
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据
 * 
 * 我们来回想一下我们的程序有没有上面的问题呢?
 * A:是否是多线程环境	是
 * B:是否有共享数据	是
 * C:是否有多条语句操作共享数据	是
 * 
 * 由此可见我们的程序出现问题是正常的，因为它满足出问题的条件。
 * 接下来才是我们要想想如何解决问题呢?
 * A和B的问题我们改变不了，我们只能想办法去把C改变一下。
 * 思想：
 * 		把多条语句操作共享数据的代码给包成一个整体，让某个线程在执行的时候，别人不能来执行。
 * 问题是我们不知道怎么包啊?其实我也不知道，但是Java给我们提供了：同步机制。
 * 
 * 同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码;
 * 		}
 * 
 * 		A:对象是什么呢?
 * 			任意对象
 * 		B:需要同步的代码是哪些呢?
 * 			把多条语句操作共享数据的代码的部分给包起来
 * 
 * 		注意：
 * 			同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 			多个线程必须是同一把锁。
 * 同步的特点：
 * 		前提：
 * 			多个线程
 *		解决问题的时候要注意：
 *			多个线程使用的是同一个锁对象
 * 同步的好处：
 *		同步的出现解决了多线程的安全问题。
 * 同步的弊端：
 *		当线程相当多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
 */
class MyRunnable implements Runnable {
	// 定义票数
	private int tickets = 100;
	//创建锁对象
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class SellTicketsDemo {
	public static void main(String[] args) {
		// 创建MyRunnable对象
		MyRunnable my = new MyRunnable();
		// 创建Thread线程对象
		Thread th1 = new Thread(my);
		Thread th2 = new Thread(my);
		Thread th3 = new Thread(my);

		// 对Thread线程对象setName
		th1.setName("窗口1");
		th2.setName("窗口2");
		th3.setName("窗口3");

		// 启动线程
		th1.start();
		th2.start();
		th3.start();
	}
}
