package com.thread_inner;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 
 * 匿名内部类的格式：
 * 		new 类名或者接口名() {
 * 			重写方法;
 * 		};
 * 		本质：是该类或者接口的子类对象。
 *
 * 继承Thread方式是用匿名内部类
 */
public class Thead_Inner_Extents {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				for(int x=0;x<101;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		}.start();
	}
}
