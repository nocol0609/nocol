package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 局部内部类 
 *        A:可以直接访问外部类的成员 
 *        B:在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
 * 
 *    面试题： 
 *          局部内部类访问局部变量的注意事项? 
 *          A:局部内部类访问的局部变量必须用final修饰
 *          B:为什么呢?
 *         局部变量是随着方法的调用而调用，随着调用完毕而消失。 而堆内存的内容并不会立即消失。所以，我们加final修饰。
 *         加入final修饰后，这个变量就成了常量。既然是常量。你消失了。 我在内存中存储的是数据20，所以，我还是有数据在使用。
 */
class Outer4 {
	
	private int num = 10;
   
	public void method() {
		// int num = 20;             
	    final int num2 = 20;         //若要被局部内部类访问，该局部内部类的局部变量必须用final修饰
	    
		class Inner {                //局部内部类
			public void show() {
				System.out.println(num);    //访问的 成员变量 不需要被final修饰
				
				System.out.println(num2);  //20 //从内部类中访问本地变量(局部变量)num2; 需要被声明为最终类型
			}
		}
		
		Inner i = new Inner();   //在局部内部类外创建其对象，方便实现对内部类内方法的调用
		i.show();
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.method();
	}
}
