package com.noocl_02;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �жϹ���
 *		String���public boolean matches(String regex)
 *
 * ����
 * 		�ж��ֻ������Ƿ�����Ҫ��?
 * 
 * ������
 * 		A:����¼���ֻ�����
 * 		B:�����ֻ�����Ĺ���
 * 			13436975980
 * 			13688886868
 * 			13866668888
 * 			13456789012
 * 			13123456789
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
public class RegexJudge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ֻ��ţ�");
		String phoneNumber=sc.nextLine();
		
		//�����ֻ��Ź���
		String regex="1[38][0-9]{9}";
		//�����жϹ���
		boolean flag=phoneNumber.matches(regex);
		System.out.println(flag);
	}
}
