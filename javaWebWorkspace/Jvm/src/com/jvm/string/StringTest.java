package com.jvm.string;

import org.junit.Test;


/**
		String.intern������һ��Native���������������ǣ�����ַ������������Ѿ�����һ����
	�ڴ�String������ַ������򷵻ش����������ַ�����String���󣻷��򣬽���String�����
	�����ַ�����ӵ��������У����ҷ��ش�String��������á�
	  	
	  	��δ�����JDK 1.6�����У���õ�����false������JDK 1.7�����У���õ�һ��true��һ
	��false�����������ԭ���ǣ���JDK 1.6�У�intern������������״��������ַ���ʵ������
	�����ô��У����ص�Ҳ�����ô�������ַ���ʵ�������ã�����StringBuilder�������ַ���
	ʵ����Java���ϣ����Ա�Ȼ����ͬһ�����ã�������false����JDK 1.7���Լ�������������
	��������JRockit����intern����ʵ�ֲ����ٸ���ʵ����ֻ���ڳ������м�¼�״γ��ֵ�ʵ��
	���ã����intern�������ص����ú���StringBuilder�������Ǹ��ַ���ʵ����ͬһ����
	
	��str2�ȽϷ���false����Ϊ��java������ַ�����ִ��StringBuilder.toString����֮ǰ�Ѿ����ֹ���
	�ַ������������Ѿ������������ˣ������ϡ��״γ��֡���ԭ�򣬶�����������������ַ��������״γ��ֵģ���˷���true��
 
 */
public class StringTest {
	@Test
	public void testString() {
		
		String str1=new StringBuilder("�����").append("���").toString();
		System.out.println(str1.intern()==str1); //true  
		
		System.out.println("----------------");
		String str2=new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern()==str2); //false
		
		System.out.println("----------------");
		String str3=new StringBuilder("he").append("llo").toString();
		System.out.println(str3.intern()==str3); //true
		
		System.out.println("----------------");
		String str4=new StringBuilder("he").append("llo").toString();
		System.out.println(str4.intern()==str4); //false
		
		System.out.println("-----------------");
		String str5="hello";
 		System.out.println(str5.intern()==str5); //true  ----ֱ�ӳ����ط���
		
		System.out.println("-----------------");
		String str6=new StringBuilder("hello").toString(); 
		System.out.println(str6.intern()==str6); //false
		
		
	}
}
