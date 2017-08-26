package com.nocol_05;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 * 
 * 分析：
 * 		A:键盘录入一个字符串
 * 		B:定义一个新字符串
 * 		C:倒着遍历字符串，得到每一个字符
 * 			a:length()和charAt()结合
 * 			b:把字符串转成字符数组
 * 		D:用新字符串把每一个字符拼接起来
 * 		E:输出新串
 *      F：方法实现
 */
/*public class StringTest2 {
	public static void main(String[] args) {
		//键盘录入一个字符串
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一字符串：");
	String s1=sc.nextLine();
	//定义一个新字符串
	String s2="";
	//将键盘录入的字符串转成字符数组以遍历
	char[] chs=s1.toCharArray();
	//倒着遍历字符串，得到每一个字符
	for(int x=chs.length-1;x>=0;x--){
		//用新字符串把每一个字符拼接起来
		s2+=chs[x];
	}
	//输出新串
	System.out.println("反转后的字符串是："+s2);
	}
}*/

//方法实现
public class StringTest2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一字符串：");
		String s=sc.nextLine();
		//方法调用
		String result=null;
		result=StringTest2.Reverse(s);
		//result=Reverse(s);
		System.out.println("反转后的新字符串为："+result);
	}
	public static String Reverse(String s){
		//定义一个新字符串
		String s2="";
		//将键盘录入的字符串转成字符数组以遍历
		char[] chs=s.toCharArray();
		//倒着遍历字符串，得到每一个字符
		for(int x=chs.length-1;x>=0;x--){
			//用新字符串把每一个字符拼接起来
			s2+=chs[x];	
		}
		return s2;
	}
}