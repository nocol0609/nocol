package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * A:同步代码块的锁对象是谁呢?
 * 		任意对象。
 * 
 * B:同步方法的格式及锁对象问题?
 * 		格式：把同步关键字加在方法上。
 * 
 * 		同步方法的锁对象是?
 * 			this
 * 
 * C:静态方法及锁对象问题?
 * 		静态方法的锁对象是谁呢?
 * 			类的字节码文件对象。(当前class文件)
 */
class SellTicket implements Runnable {

	// 定义100张票
	private static int tickets = 100;

	// 定义同一把锁
	private Object obj = new Object();
	private Demo d = new Demo();

	private int x = 0;
	
	//同步代码块用obj做锁
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (obj) {
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "正在出售第" + (tickets--) + "张票 ");
//				}
//			}
//		}
//	}
	
	//同步代码块用任意对象做锁
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (d) {
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "正在出售第" + (tickets--) + "张票 ");
//				}
//			}
//		}
//	}
	
	@Override
	public void run() {
		while (true) {
			if(x%2==0){
				synchronized (SellTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在出售第" + (tickets--) + "张票 ");
					}
				}
			}else {
//				synchronized (d) {
//					if (tickets > 0) {
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//						System.out.println(Thread.currentThread().getName()
//								+ "正在出售第" + (tickets--) + "张票 ");
//					}
//				}
				
				sellTicket();
				
			}
			x++;
		}
	}

//	private void sellTicket() {
//		synchronized (d) {
//			if (tickets > 0) {
//			try {
//					Thread.sleep(100);
//			} catch (InterruptedException e) {
//					e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()
//						+ "正在出售第" + (tickets--) + "张票 ");
//			}
//		}
//	}
	
	//如果一个方法一进去就看到了代码被同步了，那么我就再想能不能把这个同步加在方法上呢?
//	 private synchronized void sellTicket() {
//			if (tickets > 0) {
//			try {
//					Thread.sleep(100);
//			} catch (InterruptedException e) {
//					e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()
//						+ "正在出售第" + (tickets--) + "张票 ");
//			}
//	}
	
	private static synchronized void sellTicket() {//静态方法
		if (tickets > 0) {
		try {
				Thread.sleep(100);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
					+ "正在出售第" + (tickets--) + "张票 ");
		}
}
}

class Demo {
	
}

public class SellTicketsDemo2 {
	public static void main(String[] args) {
		// 创建资源对象
		SellTicket st = new SellTicket();

		// 创建三个线程对象
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}
