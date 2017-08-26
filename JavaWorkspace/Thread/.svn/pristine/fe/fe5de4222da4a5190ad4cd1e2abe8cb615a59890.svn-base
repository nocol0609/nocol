package com.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer:定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)  //指定时间执行任务
 * 		public void schedule(TimerTask task,long delay,long period)//指定时间执行任务后，再某时间间隔重复执行
 * 		public void cancel()
 * TimerTask:任务
 */
// 指定任务
class MyTask extends TimerTask { // TimerTask是实现Runnable接口的一个类

	private Timer t;

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("boom!!!");
		t.cancel();
	}

}

public class TimerDemo {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t=new Timer();
		//调用方法启动任务
		//public void schedule(TimerTask task,long delay)
		t.schedule(new MyTask(t), 3000); //将t传入定时任务使任务执行后结束，若定时任务不定义t,则不需要传t,此时任务结束
		                                 //结束后将不会停止
	}
		
}
