package com.nocol_03;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �ָ��
 *		String���public String[] split(String regex)
 *		���ݸ���������ʽ��ƥ���ִ��ַ����� 
 *
 * ������
 *      ����һ���䷶Χ��Ҫ���ж�����ֵ�Ƿ��ڸ����䷶Χ��
 * 			��Χ��"18-24"
 *                       //�����õ���С������������Ȼ�����ж�
 * 		age>=18 && age<=24
 */
public class RegexFenge {
	public static void main(String[] args) {
		//�������䷶Χ
		String s1="18-24";
		//������򣨷ָ��ǣ�
		String regex="-";//��"-"Ϊ�ָ���
		//���÷���
		//public String[] split(String regex)   //�ַ����������
		String[] strArray=s1.split(regex);
		
		//�õ��ַ��������е��ַ�Ԫ��
		//ע���õ���Ԫ�����ַ������ͣ���Ҫת����int����
		int startAge=Integer.parseInt(strArray[0]);   //�õ���һ��
		int endAge=Integer.parseInt(strArray[1]);//�õ����һ��
		
		//���������жϼ���
		Scanner sc=new Scanner(System.in);
		System.out.println("���������䣺");
		int age=sc.nextInt();
		
		if(age>startAge&&age<endAge){
			System.out.println("�����䷶Χ��");
		}else {
			System.out.println("�������䷶Χ��");
		} 
	}
}
