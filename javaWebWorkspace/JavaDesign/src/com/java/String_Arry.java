package com.java;

import java.util.StringTokenizer;

/*
 * 将一段以逗号为分割符的字符串转换成一个数组
 */
public class String_Arry {
	public static void main(String[] args) {
		String str = "hello,world,java";
		
		//方式一：
//		String[] arry = str.split(",");
//		for (String s : arry) {
//			System.out.println(s);
//		}
		
		//方式二：
		StringTokenizer st=new StringTokenizer(str, ",");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
