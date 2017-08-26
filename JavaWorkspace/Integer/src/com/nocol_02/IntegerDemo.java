package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Integer的构造方法：
 * public Integer(int value)
 * public Integer(String s)
 * 		注意：这个字符串必须是由数字字符组成
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// 方式1
		int i = 100;
		Integer ii = new Integer(i);   //将int类型的100转换成Integer类型
		System.out.println("ii:" + ii);//Integer已重写Object类的toString()方法，所以打印100
                               
		// 方式2
		String s = "100";
		// NumberFormatException
		// String s = "abc";
		Integer iii = new Integer(s);//将String字符串"100"转换成Integer类型
		System.out.println("iii:" + iii);//100
	}
}
