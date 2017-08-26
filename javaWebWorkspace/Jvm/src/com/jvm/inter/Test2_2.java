package com.jvm.inter;

import java.util.Random;

/**
 * 类的初始化时机
 * @author Nocol
 *
 */
class FinalTest2{
	
	public static final int x=new Random().nextInt(100);  //x为编译不确定的变量，只有在运行的时候才能确定，会触发类的初始化，执行静态代码块
	
	static{
		System.out.println("FinalTest2 satic block");
	}
	
}

public class Test2_2 {
	public static void main(String[] args) {
		System.out.println(FinalTest2.x);
	}
}
