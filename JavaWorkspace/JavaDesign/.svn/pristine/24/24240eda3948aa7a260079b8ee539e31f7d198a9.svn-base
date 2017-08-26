package com.java;

import java.util.Scanner;

/*
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Test03_Ball {
	public static void main(String[] args) {
		
//		int length=0;
//		int h=100;
//		for (int i = 1; i <= 10; i++) {
//			h/=2.0;
//			length+=h;
//		}
//		
//		System.out.println("经过第"+10+"次反弹后，小球共经过"+length+"米，"+"第"+10+"次反弹高度为"+h+"米");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入小球落地前的高度：");
		int heigth=sc.nextInt();
		System.out.println("请输入要求解的次数：");
		int num=sc.nextInt();
		sc.close();
		
		//调用通用方法
		Test(heigth,num);
		
	}

	private static void Test(int heigth, int num) {
		// TODO Auto-generated method stub
		int length=0;
		for (int i = 0; i < num; i++) {
			
			heigth/=2;
			length+=heigth;
			
		}
		System.out.println("经过第"+10+"次反弹后，小球共经过"+length+"米，"+"第"+10+"次反弹高度为"+heigth+"米");
	}
}
