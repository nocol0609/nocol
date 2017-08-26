package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 需求1：我要求大家把100这个数据的二进制，八进制，十六进制计算出来
 * 需求2：我要求大家判断一个数据是否是int范围内的。
 * 		首先你的知道int的范围是多大?
 * 
 * 为了对基本数据类型进行更多的操作，更方便的操作，Java就针对每一种基本数据类型提供了对应的类类型。包装类类型。
 * byte 			Byte
 * short			Short
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 * 
 * 用于基本数据类型与字符串之间的转换。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// 利用构造方法直接转换
		// public static String toBinaryString(int i)//传一个int型数值转换成2进制
		System.out.println(Integer.toBinaryString(100));
		// public static String toOctalString(int i)//转换成8进制
		System.out.println(Integer.toOctalString(100));
		// public static String toHexString(int i)//转换成16进制
		System.out.println(Integer.toHexString(100));

		// public static final int MAX_VALUE
		System.out.println(Integer.MAX_VALUE);//int类型的值2的31次方再减1
		// public static final int MIN_VALUE
		System.out.println(Integer.MIN_VALUE);//2的负31次方
	}
}
