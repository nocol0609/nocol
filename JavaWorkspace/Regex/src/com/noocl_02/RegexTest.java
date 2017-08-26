package com.noocl_02;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 校验邮箱
 * 
 * 分析：
 * 		A:键盘录入邮箱
 * 		B:定义邮箱的规则
 * 			1517806580@qq.com
 * 			liuyi@163.com
 * 			linqingxia@126.com
 * 			fengqingyang@sina.com.cn
 * 			fqy@itcast.cn
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
public class RegexTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email=sc.nextLine();
		
		//定义邮箱规则
		String regex="[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		//String regex="\\w+@\\w{2,6}(\\.\\w{2,3})+";
		//调用方法判断
		boolean flag=email.matches(regex);
		System.out.println(flag);
	}
}
