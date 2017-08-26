package com.java;

import java.util.Scanner;

/*
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class Test03_22222 {
	public static void main(String[] args) {
		
//		int num=0;
//		int sum=0;
//		for(int i=1;i<=5;i++){
//			
//			num=num*10+2;
//			sum+=num;
//		}
//		System.out.println("2+22+222+2222+22222="+sum);
		
		System.out.println("求s=a +aa+aaa+aaaa+aa...a的值，请输入a的值：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("请输入要相加的次数：");
		int count = sc.nextInt();
		sc.close();
		//调用方法打印
		Test(a,count);
	}

	private static void Test(int a, int count) {
		// TODO Auto-generated method stub	
		int num=0;
		int sum=0;
		for (int i = 1; i <= count; i++) {
			num=num*10+a;
			sum+=num;
		}
		System.out.println("计算后的结果是："+sum);
	}
}
