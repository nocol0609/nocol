package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 字符串的特点：一旦被赋值，就不能改变。
 * 但是：不会改变的只是最开始复制的部分
 *    //String s = "hello";    //指 "hello"不会再改变 ，不是指s不会改变
 *		s += "world";
 *		System.out.println("s:" + s); // 打印helloworld
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println("s:" + s); // helloworld
	}
}
