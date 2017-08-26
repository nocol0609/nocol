package com.thread_inner;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 匿名内部类的格式：
 * 		new 类名或者接口名() {
 * 			重写方法;
 * 		};
 * 		本质：是该类或者接口的子类对象。
 * 
 * 实现Runnable方式使用匿名内部类
 */
public class Thread_Inner_Runnable {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int x=0;x<101;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}				
			}
		}){}.start();//此时重写的是Runnable里面的run()方法，但是Thread里面也可以重写Run()方法，一般只写一个
		
		
		//Thread和Runnable都重写Run()方法(无意义)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int x=0;x<101;x++){
					System.out.println("Runnable_run"+x);
				}
			}
		}){
			public void run() {
				for(int x=0;x<101;x++){
					System.out.println("Thread_run"+x); //此时走的是Thread里面的Run方法
				}
			};
		}.start();
		
	}
}
