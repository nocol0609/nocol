package com.error;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 看程序写结果
 */
public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);// false，地址值不同
		System.out.println(s1.equals(s2));// true，Sting类的equals()方法已重写，比较的是值是否相同

		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// true

		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5 == s6);// true，s6直接用s5在方法区中常量池创建的"hello",所以两地址值相同
		System.out.println(s5.equals(s6));// true
		
		String s7="helloworld";
		String s8="hello"+new String("world");
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8));//true
		
		
		System.out.println("------------------------------");
		
		String string01="hellojava";
		
		String string="hello"+new String("java");
		//String string=new String("hello")+new String("java");
		System.out.println(string.intern()==string);   //
		System.out.println(string=="hellojava");      //
		
	}
}