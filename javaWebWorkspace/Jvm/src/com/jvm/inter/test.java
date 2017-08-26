package com.jvm.inter;

/**
 * 类的初始化时机：
 * 
 * 		只有当程序访问的静态变量或静态方法确实在当前类或者当前接口中定义时，
 * 才可以认为是对类或接口的主动使用
 * 
 * @author Nocol
 *
 */

class parent{
	
	static int a=3;   //静态变量定义在父类
	
	static{
		System.out.println("parent static block");
	}
	
	static void doSomething(){
		System.out.println("do something");
	}
}

class child extends parent{
	
	static{
		System.out.println("child static block");
	}
	
}

public class test {
	public static void main(String[] args) {
		
		System.out.println(child.a);
		
		child.doSomething();
		
		/*
			结果：静态变量a和静态方法都不是定义在当前child类中，所以不会对child进行初始化
			
			parent static block
			3
			do something		 
		 */
		
	}
}
