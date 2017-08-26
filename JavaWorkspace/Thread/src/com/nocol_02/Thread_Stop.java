package com.nocol_02;

import java.util.Date;

/**
* @author lxp
*
* @TODO 
* 
*//*
 * public final void stop():让线程停止，过时了，但是还可以使用。  //执行该方法后后面代码将不会执行
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 */
class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("开始执行：" + new Date());  //获取时间

		// 休息4秒钟
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("线程被终止了");
		}

		System.out.println("结束执行：" + new Date());
	}
}
public class Thread_Stop {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();

		// 超过三秒不醒过来，就杀死
		try {
			Thread.sleep(3000);
			// ts.stop();  //若用stop则异常信息无反馈
			ts.interrupt();//程序中断，后面代码依然执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
