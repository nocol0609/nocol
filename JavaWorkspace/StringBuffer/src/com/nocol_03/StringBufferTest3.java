package com.nocol_03;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 把字符串反转
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String s=sc.nextLine();
		
		//用String反转法
		String result1=StringBufferTest3.myReverse(s);
		System.out.println("用String反转法结果是："+result1);
		//用StringBuffer反转法
		String result2=StringBufferTest3.myReverse2(s);
		System.out.println("用StringBuffer反转法结果是："+result2);
	}
	
	//用StringBuffer的reverse()功能
		public static String myReverse2(String s) {  //注意返回String类型
			// StringBuffer sb = new StringBuffer();
			// sb.append(s);

			// StringBuffer sb = new StringBuffer(s);
			// sb.reverse();
			// return sb.toString();

			// 简易版
			return new StringBuffer(s).reverse().toString();
		}
	
	//String功能
	public static String myReverse(String s){
		
		String s1="";
		char[] chs=s.toCharArray();
		for(int x=chs.length-1;x>=0;x--){
			s1+=chs[x];
		}
		return s1;	
	}
}
