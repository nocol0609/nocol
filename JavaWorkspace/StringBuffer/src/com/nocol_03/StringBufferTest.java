package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* */
/*
 * Ϊʲô����Ҫ������֮���ת����
 * A -- B��ת��
 * ���ǰ�Aת��ΪB����ʵ��Ϊ��ʹ��B�Ĺ��ܡ�
 * B -- A��ת��
 * ���ǿ���Ҫ�Ľ����A���ͣ����Ի���ת������
 * 
 * String��StringBuffer���໥ת��?
 */
public class StringBufferTest {
	public static void main(String[] args) {
		// Stringװ����StringBuffer
		String s = "hello";
		
		// ע�⣺���ܰ��ַ�����ֱֵ�Ӹ�ֵ��StringBuffer
		// StringBuffer sb = "hello";
		// StringBuffer sb = s;
		
		// ��ʽ1:ͨ�����췽��
		StringBuffer sb = new StringBuffer(s);
		System.out.println("sb:" + sb);//sb:hello
		
		// ��ʽ2��ͨ��append()����
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb2:" + sb2);//sb2:hello
		System.out.println("---------------");

		// StringBufferת����String
		StringBuffer buffer = new StringBuffer("java");//ͨ�����췽������"java"
		
		// String(StringBuffer buffer)  //�÷���String���½�StringBufferr����ת����String����
		// ��ʽ1:ͨ�����췽��
		String str = new String(buffer);
		System.out.println("str:" + str);//str:java
		
		// ��ʽ2��ͨ��toString()����    //StringBuffer���Ѿ���Object��toString()������д�������ַ���
		String str2 = buffer.toString();  //StringBuffer����ֱ�ӵ�����
		System.out.println("str2:" + str2);//str2:java
	}
}