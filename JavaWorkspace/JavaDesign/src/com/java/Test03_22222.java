package com.java;

import java.util.Scanner;

/*
 * ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
 * ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
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
		
		System.out.println("��s=a +aa+aaa+aaaa+aa...a��ֵ��������a��ֵ��");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("������Ҫ��ӵĴ�����");
		int count = sc.nextInt();
		sc.close();
		//���÷�����ӡ
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
		System.out.println("�����Ľ���ǣ�"+sum);
	}
}
