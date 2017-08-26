package com.nocol_03;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 分割功能
 *		String类的public String[] split(String regex)
 *		根据给定正则表达式的匹配拆分此字符串。 
 *
 * 举例：
 *      给定一年龄范围，要求判断输入值是否在该年龄范围内
 * 			范围："18-24"
 *                       //得先拿到最小年龄和最大年龄然后再判断
 * 		age>=18 && age<=24
 */
public class RegexFenge {
	public static void main(String[] args) {
		//定义年龄范围
		String s1="18-24";
		//定义规则（分割标记）
		String regex="-";//以"-"为分割线
		//调用方法
		//public String[] split(String regex)   //字符串数组接收
		String[] strArray=s1.split(regex);
		
		//拿到字符串数组中的字符元素
		//注意拿到的元素是字符串类型，需要转换成int类型
		int startAge=Integer.parseInt(strArray[0]);   //拿到第一个
		int endAge=Integer.parseInt(strArray[1]);//拿到最后一个
		
		//输入年龄判断即可
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age=sc.nextInt();
		
		if(age>startAge&&age<endAge){
			System.out.println("在年龄范围内");
		}else {
			System.out.println("不在年龄范围内");
		} 
	}
}
