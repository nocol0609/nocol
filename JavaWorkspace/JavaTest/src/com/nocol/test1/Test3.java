package com.nocol.test1;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 面试题：
 * 		需求：在调用method()方法后，仅打印出a=100,b=200,请写出method()方法代码
 */
public class Test3 {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		Method(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	private static void Method(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a=100,b=200");
		System.exit(0);//执行完打印语句后退出JVM，main方法将无法继续执行  
	}
}
