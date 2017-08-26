package com.nocol_06;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * String类的其他功能：
 * 
 * 替换功能：
 * String replace(char old,char new)
 * String replace(String old,String new)
 *
 * 去除字符串两端的空格	
 * String trim()
 * 
 * 按字典顺序比较两个字符串  
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 */
public class StringMoreFunction {
	public static void main(String[] args) {
		// 替换功能
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replace("owo", "ak47");//替换的字符个数可以不一样
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);
		System.out.println("---------------");

		// 去除字符串两端的空格
		String s4 = " hello world  ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---"); //s4: hello world  --- 
		System.out.println("s5:" + s5 + "---"); //s5:hello world---

		// 按字典顺序比较两个字符串,返回相差的个数 ，既有正数也有负数
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));// 0  ，相同则返回 0
		System.out.println(s6.compareTo(s8));// 7 ，前面的减去后面的
		System.out.println(s6.compareTo(s9));// -16，前面的减去后面的
	}
}

