package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 内部类概述: 
 *         把类定义在其他类的内部，这个类就被称为内部类。 
 *         举例：在类A中定义了一个类B，类B就是内部类。
 * 
 * 内部的访问特点：
 *            A:内部类可以直接访问外部类的成员，包括私有。 
 *            B:外部类要访问内部类的成员，必须创建对象。
 * 
 * 内部类位置： 
 *          成员位置:在成员位置定义的类，被称为成员内部类。 
 *          局部位置:在局部位置定义的类，被称为局部内部类。
 * 
 *           成员内部类（无修饰符修饰）：如何直接访问内部类的成员？
 * 
 *           格式： 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 * 
 */
class Outer {
	private int num = 100;

	class Inner {               //此时该内部类无任何修饰符修饰
		public void show() {
			System.out.println(num);    //内部类直接访问外部类私有成员
		}
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		// 需求：我要访问Inner类的show()方法
		// Inner i = new Inner(); 报错
		// i.show();报错

		// 格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
