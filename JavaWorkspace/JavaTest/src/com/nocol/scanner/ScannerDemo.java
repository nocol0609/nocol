package com.nocol.scanner;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Scanner:���ڽ��ռ���¼�����ݡ�
 * 
 * ǰ���ʱ��
 * 		A:����
 * 		B:��������
 * 		C:���÷���
 * 
 * System������һ����̬���ֶΣ�
 * class System {
 * 		public static final InputStream in; ��׼������������Ӧ�ż���¼�롣
 * }
 * 		InputStream is = System.in;  //�������´������
 * ======================================================================================
 * class Demo {
 * 		public static final int x = 10;           //��Ӧ int y=Demo.x
 * 		public static final Student s = new Student();   //��ӦStudent s=Demo.s
 * }
 * int y = Demo.x;     //����ͬ��������int���ո�ֵ
 * Student s = Demo.s; //����ͬ��������Student���ո�ֵ
 * ======================================================================================
 * 
 * ���췽����
 * 		Scanner(InputStream source)
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//�Զ�����
		Scanner sc=new Scanner(System.in);//System.in ,˵��System�Ǹ��࣬��in����System���µľ�̬�ֶ�
			System.out.println("������ֵ��");
			//���̽���
			int a=sc.nextInt();
			//��ӡa
			System.out.println("a��ֵ��"+a);
	}
}
