package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Integer�Ĺ��췽����
 * public Integer(int value)
 * public Integer(String s)
 * 		ע�⣺����ַ����������������ַ����
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// ��ʽ1
		int i = 100;
		Integer ii = new Integer(i);   //��int���͵�100ת����Integer����
		System.out.println("ii:" + ii);//Integer����дObject���toString()���������Դ�ӡ100
                               
		// ��ʽ2
		String s = "100";
		// NumberFormatException
		// String s = "abc";
		Integer iii = new Integer(s);//��String�ַ���"100"ת����Integer����
		System.out.println("iii:" + iii);//100
	}
}
