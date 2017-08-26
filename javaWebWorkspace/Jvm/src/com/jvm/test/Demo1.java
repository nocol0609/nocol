package com.jvm.test;

import org.junit.Test;

public class Demo1 {
	
	
	/**
	 * 对于String这个jdk自带的类，由根类加载器加载
	 * 
	 * 若一个类由根加载器加载，那么返回的加载器对象为空,因为根类加载器由c++实现，出于安全考虑不允许得到这个类
	 */
	@Test
	public void testClassLoder() throws Exception{
		
		Class clazz=Class.forName("java.lang.String");
		
		System.out.println(clazz.getClassLoader());  //null
		
	}
	
	/**
	 * 对于自定义类，由系统加载器（应用加载器：AppClassLoader）加载
	 * 
	 */
	@Test
	public void test2() throws Exception {
		
         Class clazz=Class.forName("com.jvm.Demo1");
		
		System.out.println(clazz.getClassLoader());//sun.misc.Launcher$AppClassLoader@454e2c9c
	}
}
