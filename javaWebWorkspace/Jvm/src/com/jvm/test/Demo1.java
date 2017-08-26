package com.jvm.test;

import org.junit.Test;

public class Demo1 {
	
	
	/**
	 * ����String���jdk�Դ����࣬�ɸ������������
	 * 
	 * ��һ�����ɸ����������أ���ô���صļ���������Ϊ��,��Ϊ�����������c++ʵ�֣����ڰ�ȫ���ǲ�����õ������
	 */
	@Test
	public void testClassLoder() throws Exception{
		
		Class clazz=Class.forName("java.lang.String");
		
		System.out.println(clazz.getClassLoader());  //null
		
	}
	
	/**
	 * �����Զ����࣬��ϵͳ��������Ӧ�ü�������AppClassLoader������
	 * 
	 */
	@Test
	public void test2() throws Exception {
		
         Class clazz=Class.forName("com.jvm.Demo1");
		
		System.out.println(clazz.getClassLoader());//sun.misc.Launcher$AppClassLoader@454e2c9c
	}
}
