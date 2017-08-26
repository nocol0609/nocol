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
 * public void schedule(TimerTask task,long delay,long period)//指定时间执行任务后，再某时间间隔重复执行
 * 
 *    此时定时任务不需要定义Timer对象t使任务结束
 */
class Mtask2 extends TimerTask {

	@Override
	public void run() {
		System.out.println("boom!!!");
	}
}

public class TimerDemo2 {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t=new Timer();
		//public void schedule(TimerTask task,long delay,long period)
		t.schedule(new Mtask2(), 3000, 1000);//3秒后执行，之后每1秒重复执行
	}
}
