package com.java;

import java.util.Scanner;

/*
 * ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
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
//		System.out.println("������"+10+"�η�����С�򹲾���"+length+"�ף�"+"��"+10+"�η����߶�Ϊ"+h+"��");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������С�����ǰ�ĸ߶ȣ�");
		int heigth=sc.nextInt();
		System.out.println("������Ҫ���Ĵ�����");
		int num=sc.nextInt();
		sc.close();
		
		//����ͨ�÷���
		Test(heigth,num);
		
	}

	private static void Test(int heigth, int num) {
		// TODO Auto-generated method stub
		int length=0;
		for (int i = 0; i < num; i++) {
			
			heigth/=2;
			length+=heigth;
			
		}
		System.out.println("������"+10+"�η�����С�򹲾���"+length+"�ף�"+"��"+10+"�η����߶�Ϊ"+heigth+"��");
	}
}
