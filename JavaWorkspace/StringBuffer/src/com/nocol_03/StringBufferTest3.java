package com.nocol_03;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���ַ�����ת
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ�����");
		String s=sc.nextLine();
		
		//��String��ת��
		String result1=StringBufferTest3.myReverse(s);
		System.out.println("��String��ת������ǣ�"+result1);
		//��StringBuffer��ת��
		String result2=StringBufferTest3.myReverse2(s);
		System.out.println("��StringBuffer��ת������ǣ�"+result2);
	}
	
	//��StringBuffer��reverse()����
		public static String myReverse2(String s) {  //ע�ⷵ��String����
			// StringBuffer sb = new StringBuffer();
			// sb.append(s);

			// StringBuffer sb = new StringBuffer(s);
			// sb.reverse();
			// return sb.toString();

			// ���װ�
			return new StringBuffer(s).reverse().toString();
		}
	
	//String����
	public static String myReverse(String s){
		
		String s1="";
		char[] chs=s.toCharArray();
		for(int x=chs.length-1;x>=0;x--){
			s1+=chs[x];
		}
		return s1;	
	}
}
