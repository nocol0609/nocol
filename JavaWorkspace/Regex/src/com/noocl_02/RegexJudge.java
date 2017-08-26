package com.noocl_02;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 判断功能
 *		String类的public boolean matches(String regex)
 *
 * 需求：
 * 		判断手机号码是否满足要求?
 * 
 * 分析：
 * 		A:键盘录入手机号码
 * 		B:定义手机号码的规则
 * 			13436975980
 * 			13688886868
 * 			13866668888
 * 			13456789012
 * 			13123456789
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
public class RegexJudge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入手机号：");
		String phoneNumber=sc.nextLine();
		
		//定义手机号规则
		String regex="1[38][0-9]{9}";
		//调用判断功能
		boolean flag=phoneNumber.matches(regex);
		System.out.println(flag);
	}
}
