package com.nocol_01;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 校验qq号码（正则表达式写法）：
 * 		1:要求必须是5-15位数字
 * 		2:0不能开头
 * 
 * 分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入QQ号：");
		String qq=sc.nextLine();
		
		//调用功能校验
	}
	public static boolean checkQQ(String qq){
		//定义规则
		String regex="[1-9][0-9]{4-14}";
		//public boolean matches(String regex)告知此字符串是否匹配给定的正则表达式
		boolean flag=qq.matches(regex);
		return flag;
		
		//return qq.matches("[1-9][0-9]{4,14}");
		
		//return qq.matches("[1-9]\\d{4,14}");
	} 
}
