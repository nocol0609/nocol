package com.nocol_05;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * String��ת�����ܣ�
 * byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
 * char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
 * static String valueOf(char[] chs):���ַ�����ת���ַ�����
 * static String valueOf(int i):��int���͵�����ת���ַ�����
 * 		ע�⣺String���valueOf�������԰��������͵�����ת���ַ�����
 * String toLowerCase():���ַ���ת��Сд��
 * String toUpperCase():���ַ���ת�ɴ�д��
 * String concat(String str):���ַ���ƴ�ӡ�
 */
public class StringChange {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "JavaSE";

		// byte[] getBytes():���ַ���ת��Ϊ�ֽ����飨�����ֽ����飩��
		byte[] bys = s.getBytes();  //byte[] bys �ֽ��������
		for (int x = 0; x < bys.length; x++) {
			System.out.println(bys[x]);
		}
		System.out.println("----------------");

		// char[] toCharArray():���ַ���ת��Ϊ�ַ����飨�����ַ����飩��
		char[] chs = s.toCharArray();  //char[] ch �ַ��������
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("----------------");

		// static String valueOf(char[] chs):���ַ�����ת���ַ�����
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("----------------");

		// static String valueOf(int i):��int���͵�����ת���ַ�����
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("----------------");

		// String toLowerCase():���ַ���ת��Сд��
		System.out.println("toLowerCase:" + s.toLowerCase());//javase
		System.out.println("s:" + s);  //JavaSE,װ����ԭ���Ĳ���,����clone();
		// System.out.println("----------------");
		
		// String toUpperCase():���ַ���ת�ɴ�д��
		System.out.println("toUpperCase:" + s.toUpperCase());//JAVASE
		System.out.println("----------------");

		// String concat(String str):���ַ���ƴ�ӡ�
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);//helloworld
		System.out.println("s4:"+s4);//helloworld
	}
}
