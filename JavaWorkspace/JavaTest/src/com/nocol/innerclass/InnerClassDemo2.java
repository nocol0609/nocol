package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 *
 *   	  成员位置:在成员位置定义的类，被称为成员内部类。(内部类被private修饰)
 *            
 *    注：成员内部类 可以看成是外部类的一个 成员变量 ，所以外部类的方法里面可以直接拿内部类创建其对象并使用，
 *       即使内部类用private修饰同样可以。      
 * 
 */
class Outer1 {
	private int num = 200;

	 private class Inner {         //内部类被Private修饰
		public void show() {
			System.out.println(num);//内部类直接访问外部类私有成员
		}
	}

	public void method() {
		// 找不到符号
		// show();

		Inner i = new Inner();     //创建内部类对象，测试时可通过创建外部类Outer对象调用method()方法从而
		                           //实现对内部类中定义的方法的调用
		i.show();
	}

}

class InnerClassDemo2 {
	public static void main(String[] args) {
      //测试
	  //需求：访问Inner类的show()方法
		Outer1 o=new Outer1();
		o.method();   //打印10
	}
}