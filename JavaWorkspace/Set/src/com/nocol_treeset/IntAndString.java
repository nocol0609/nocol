package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * int类型和String类型的相互转换
 * 
 * int -- String
 * 		String.valueOf(number)
 * 
 * String -- int
 * 		Integer.parseInt(s)
 * 
 * 扩充：String -- float
 *      Float.parseInt(s)
 *      String -- double
 *      Double.parseInt(s)
 *      .....
 */
public class IntAndString {
	public static void main(String[] args) {
		// int转换成 String
		int number = 100;
		// 方式1
		String s1 = "" + number;
		System.out.println("s1:" + s1);
		// 方式2
		String s2 = String.valueOf(number);//String类下valueOf可将任何类型转换成String类型
		System.out.println("s2:" + s2);
		// 方式3
		// int -- Integer -- String
		Integer i = new Integer(number);
		String s3 = i.toString(); //Interger类已重写toString()方法
		System.out.println("s3:" + s3);
		// 方式4
		// public static String toString(int i)  //传入int用String接收
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);
		System.out.println("-----------------");

		// String 转换成 int
		String s = "100";
		// 方式1
		// String -- Integer -- int
		Integer ii = new Integer(s);//先转Intefer
		// public int intValue()  //Integer类下将Integer转换成功int的方法
		int x = ii.intValue();
		System.out.println("x:" + x);
		//方式2
		//public static int parseInt(String s)  //传入String用int接收
		int y = Integer.parseInt(s);
		System.out.println("y:"+y);
	}
}
