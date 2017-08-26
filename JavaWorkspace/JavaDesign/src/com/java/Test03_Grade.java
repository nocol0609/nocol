package com.java;

import java.util.Scanner;

/*
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 
 *      条件运算符： (a>b)?a:b     嵌套
 */
public class Test03_Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数：");
		int score = sc.nextInt();
		sc.close();
		if(score>100 || score<0){
			System.out.println("输入分数无效！");
		}else {
			String s=(score>=90)?"属于A等级":((score<60)?"属于C等级":"属于B等级");
			System.out.println(score+s);
		}
	}
}
