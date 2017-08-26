package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* */
/*
 * 为什么我们要讲解类之间的转换：
 * A -- B的转换
 * 我们把A转换为B，其实是为了使用B的功能。
 * B -- A的转换
 * 我们可能要的结果是A类型，所以还得转回来。
 * 
 * String和StringBuffer的相互转换?
 */
public class StringBufferTest {
	public static void main(String[] args) {
		// String装换成StringBuffer
		String s = "hello";
		
		// 注意：不能把字符串的值直接赋值给StringBuffer
		// StringBuffer sb = "hello";
		// StringBuffer sb = s;
		
		// 方式1:通过构造方法
		StringBuffer sb = new StringBuffer(s);
		System.out.println("sb:" + sb);//sb:hello
		
		// 方式2：通过append()方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb2:" + sb2);//sb2:hello
		System.out.println("---------------");

		// StringBuffer转换成String
		StringBuffer buffer = new StringBuffer("java");//通过构造方法添加"java"
		
		// String(StringBuffer buffer)  //该方法String类下将StringBufferr类型转换成String类型
		// 方式1:通过构造方法
		String str = new String(buffer);
		System.out.println("str:" + str);//str:java
		
		// 方式2：通过toString()方法    //StringBuffer类已经将Object中toString()方法重写，返回字符串
		String str2 = buffer.toString();  //StringBuffer对象直接调方法
		System.out.println("str2:" + str2);//str2:java
	}
}