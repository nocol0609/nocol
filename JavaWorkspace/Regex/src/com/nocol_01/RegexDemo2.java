package com.nocol_01;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * У��qq���루������ʽд������
 * 		1:Ҫ�������5-15λ����
 * 		2:0���ܿ�ͷ
 * 
 * ������
 * 		A:����¼��һ��QQ����
 * 		B:дһ������ʵ��У��
 * 		C:���ù��ܣ���������
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������QQ�ţ�");
		String qq=sc.nextLine();
		
		//���ù���У��
	}
	public static boolean checkQQ(String qq){
		//�������
		String regex="[1-9][0-9]{4-14}";
		//public boolean matches(String regex)��֪���ַ����Ƿ�ƥ�������������ʽ
		boolean flag=qq.matches(regex);
		return flag;
		
		//return qq.matches("[1-9][0-9]{4,14}");
		
		//return qq.matches("[1-9]\\d{4,14}");
	} 
}
