package com.nocol_04;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �滻����
 *  	String���public String replaceAll(String regex,String replacement)
 *  	ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ����� 
 */
public class RegexReplace {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "helloqq12345worldkh622112345678java";

		// ��Ҫȥ�����е�����,��*���滻��
		// String regex = "\\d+";  //helloqq*worldkh*java
		
		// String regex = "\\d";
		//String ss = "*";         //hello*****qqworldkh************java
		
		// ֱ�Ӱ����ָɵ�
		String regex = "\\d+";
		String ss = ""; //helloqqworldkhjava

		String result = s.replaceAll(regex, ss);
		System.out.println(result);
	}
}

