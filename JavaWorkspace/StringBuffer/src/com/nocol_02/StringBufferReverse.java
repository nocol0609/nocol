package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer�ķ�ת���ܣ�
 * public StringBuffer reverse()
 */
public class StringBufferReverse {
	public static void main(String[] args) {
		//�����ַ�����������
		StringBuffer sb=new StringBuffer();
		//�������
		sb.append("abc");
		sb.reverse();
		System.out.println("sb:"+sb); //cba
	}
}
