package com.nocol_05;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:����һ�����ַ���
 * 		C:���ű����ַ������õ�ÿһ���ַ�
 * 			a:length()��charAt()���
 * 			b:���ַ���ת���ַ�����
 * 		D:�����ַ�����ÿһ���ַ�ƴ������
 * 		E:����´�
 *      F������ʵ��
 */
/*public class StringTest2 {
	public static void main(String[] args) {
		//����¼��һ���ַ���
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ�ַ�����");
	String s1=sc.nextLine();
	//����һ�����ַ���
	String s2="";
	//������¼����ַ���ת���ַ������Ա���
	char[] chs=s1.toCharArray();
	//���ű����ַ������õ�ÿһ���ַ�
	for(int x=chs.length-1;x>=0;x--){
		//�����ַ�����ÿһ���ַ�ƴ������
		s2+=chs[x];
	}
	//����´�
	System.out.println("��ת����ַ����ǣ�"+s2);
	}
}*/

//����ʵ��
public class StringTest2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�ַ�����");
		String s=sc.nextLine();
		//��������
		String result=null;
		result=StringTest2.Reverse(s);
		//result=Reverse(s);
		System.out.println("��ת������ַ���Ϊ��"+result);
	}
	public static String Reverse(String s){
		//����һ�����ַ���
		String s2="";
		//������¼����ַ���ת���ַ������Ա���
		char[] chs=s.toCharArray();
		//���ű����ַ������õ�ÿһ���ַ�
		for(int x=chs.length-1;x>=0;x--){
			//�����ַ�����ÿһ���ַ�ƴ������
			s2+=chs[x];	
		}
		return s2;
	}
}