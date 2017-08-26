package com.jvm.string;

import org.junit.Test;


/**
		String.intern（）是一个Native方法，它的作用是：如果字符串常量池中已经包含一个等
	于此String对象的字符串，则返回代表池中这个字符串的String对象；否则，将此String对象包
	含的字符串添加到常量池中，并且返回此String对象的引用。
	  	
	  	这段代码在JDK 1.6中运行，会得到两个false，而在JDK 1.7中运行，会得到一个true和一
	个false。产生差异的原因是：在JDK 1.6中，intern（）方法会把首次遇到的字符串实例复制
	到永久代中，返回的也是永久代中这个字符串实例的引用，而由StringBuilder创建的字符串
	实例在Java堆上，所以必然不是同一个引用，将返回false。而JDK 1.7（以及部分其他虚拟
	机，例如JRockit）的intern（）实现不会再复制实例，只是在常量池中记录首次出现的实例
	引用，因此intern（）返回的引用和由StringBuilder创建的那个字符串实例是同一个。
	
	对str2比较返回false是因为“java”这个字符串在执行StringBuilder.toString（）之前已经出现过，
	字符串常量池中已经有它的引用了，不符合“首次出现”的原则，而“计算机软件”这个字符串则是首次出现的，因此返回true。
 
 */
public class StringTest {
	@Test
	public void testString() {
		
		String str1=new StringBuilder("计算机").append("软件").toString();
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
 		System.out.println(str5.intern()==str5); //true  ----直接常量池返回
		
		System.out.println("-----------------");
		String str6=new StringBuilder("hello").toString(); 
		System.out.println(str6.intern()==str6); //false
		
		
	}
}
