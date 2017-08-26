package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 线程安全(多线程讲解)
 * 安全 -- 同步 -- 数据是安全的
 * 不安全 -- 不同步 -- 效率高一些
 * 安全和效率问题是永远困扰我们的问题。
 * 安全：医院的网站，银行网站
 * 效率：新闻网站，论坛之类的
 * 
 * StringBuffer:
 * 		线程安全的可变字符串。
 * 
 * StringBuffer和String的区别?
 * 前者长度和内容可变，后者不可变。
 * 如果使用前者做字符串的拼接，不会浪费太多的资源。
 * 
 * StringBuffer的构造方法：
 * 		public StringBuffer():无参构造方法
 *		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 *		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 *
 * StringBuffer的方法：
 *		public int capacity()：返回当前容量。	理论值
 *		public int length():返回长度（字符数）。 实际值
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer():无参构造方法
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);//StringBuffer已重写Objet类的toString()方法，打印空
		System.out.println("sb.capacity():" + sb.capacity());//StringBuffer默认容量为16，即打印16
		System.out.println("sb.length():" + sb.length());//因StringBuffer未添加数据，所以打印0
		System.out.println("--------------------------");

		// public StringBuffer(int capacity):指定容量的字符串缓冲区对象
		StringBuffer sb2 = new StringBuffer(50);//50，指定缓冲区容量大小
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capacity():" + sb2.capacity());//50
		System.out.println("sb2.length():" + sb2.length());//0
		System.out.println("--------------------------");

		// public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
		StringBuffer sb3 = new StringBuffer("hello");//StringBuffer缓冲区通过构造方法添加数据"hello"
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capacity():" + sb3.capacity());//16+5=21
		System.out.println("sb3.length():" + sb3.length());//5
	}
}