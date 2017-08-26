package com.jvm.test;

class superClass {
	static {
		System.out.println("this superClass!");
	}

	public static int value = 123;

}

class childClass extends superClass {

	static {
		System.out.println("this chilClass!");
	}
}

public class InitTest {
	public static void main(String[] args) {
		//被动引用实例一：子类访问的静态变量在弗雷中定义的，因此不会触发子类的初始化
		System.out.println(childClass.value);
		
		//this superClass!
		//123
		
		System.out.println("----------------");
		
		//被动引用实例二：不打印
		superClass[] superClasses=new superClass[10];
			
		
		
		
	}
}
