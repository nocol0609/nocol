package com.nocol.scanner;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*Scanner�ೣ�÷�����
 * 
 * ������ʽ��
 * 		public boolean hasNextXxx():�ж��Ƿ���ĳ�����͵�Ԫ��
 * 		public Xxx nextXxx():��ȡ��Ԫ��
 * 
 * ��������int���͵ķ�������
 * 		public boolean hasNextInt()
 * 		public int nextInt()
 * 
 * ע�⣺
 * 		InputMismatchException������ĺ�����Ҫ�Ĳ�ƥ��
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������ֵ��");
		//�жϸ���ֵ�Ƿ�Ϊ����
		if(sc.hasNextInt()){
			//���̻�ȡ��������ֵ
			int a=sc.nextInt();
			System.out.println("�����������ֵΪ��"+a);
		}else{
			System.out.println("�������ֵ��������");
		}
	}
}
