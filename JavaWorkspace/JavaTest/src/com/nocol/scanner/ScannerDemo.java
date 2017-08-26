package com.nocol.scanner;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Scanner:用于接收键盘录入数据。
 * 
 * 前面的时候：
 * 		A:导包
 * 		B:创建对象
 * 		C:调用方法
 * 
 * System类下有一个静态的字段：
 * class System {
 * 		public static final InputStream in; 标准的输入流，对应着键盘录入。
 * }
 * 		InputStream is = System.in;  //参照以下代码理解
 * ======================================================================================
 * class Demo {
 * 		public static final int x = 10;           //对应 int y=Demo.x
 * 		public static final Student s = new Student();   //对应Student s=Demo.s
 * }
 * int y = Demo.x;     //用相同基本类型int接收赋值
 * Student s = Demo.s; //用相同引用类型Student接收赋值
 * ======================================================================================
 * 
 * 构造方法：
 * 		Scanner(InputStream source)
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//自动导包
		Scanner sc=new Scanner(System.in);//System.in ,说明System是个类，而in则是System类下的静态字段
			System.out.println("请输入值：");
			//键盘接收
			int a=sc.nextInt();
			//打印a
			System.out.println("a的值："+a);
	}
}
