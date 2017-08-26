package com.jvm.inter;

/**
 * 类的初始化时机
 * @author Nocol
 *
 */
class FinalTest {
	
	public static final int x=6/2;  //x为编译时的常量,在访问常量x时时  不会 触发类的初始化
	
	static{
		System.out.println("finalTeat static block");
	}
	
}

public class Test2_1{
	public static void main(String[] args) {
		
		System.out.println(FinalTest.x);
		
	}
}