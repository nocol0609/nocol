package com.error;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ������д���
 * �ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ�ӡ�
 * �ַ�������ǳ�����ӣ����ȼӣ�Ȼ���ڳ������ң�����о�ֱ�ӷ��أ����򣬾ʹ�����
 */
public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// false����������ӣ��ȸ��Կ��ռ䣬��ƴ�ӣ����Ե�ֵַ��һ��
		System.out.println(s3.equals((s1 + s2)));// true

		System.out.println(s3 == "hello" + "world");// true��"hello"��"world"�����ַ�������
		System.out.println(s3.equals("hello" + "world"));// true

		// ͨ�������뿴Դ�룬����֪�������Ѿ������˴���
		// System.out.println(s3 == "helloworld");
		// System.out.println(s3.equals("helloworld"));
	}
}