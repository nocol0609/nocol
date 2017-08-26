package com.nocol.duotai;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 看程序写结果:先判断有没有问题，如果没有，写出结果
 * 
 * 多态的成员访问特点： 方法：编译看左边，运行看右边。
 * 
 * 继承的时候： 子类中有和父类中一样的方法，叫重写。 子类中没有父亲中出现过的方法，方法就被继承过来了。
 * 
 * 打印结果： 爱 你
 */
class A {
	public void show() {
		show2();
	}

	public void show2() {
		System.out.println("我");
	}
}

class B extends A {
	/*
	 * public void show() { show2(); } //在子类中虽然看不到 ，但是被继承过来了，是实际存在的
	 */

	public void show2() {
		System.out.println("爱");
	}
}

class C extends B {
	public void show() {
		super.show(); // super即访问父类show()方法，即B中的show()方法
	}

	public void show2() {
		System.out.println("你");
	}
}

public class DuoTaiDemo3 {
	public static void main(String[] args) {
		A a = new B();
		a.show(); // 父类A中show()方法被子类B中show()方法重写了，所以打印子类show()中的内容,子类show()是从父类
					// 中继承过来的，虽然看不到但是实际存在，所以可看父类show()方法
		B b = new C();
		b.show(); // 父类B中show2()方法被子类C中show2()方法重写，因此打印C中show2()中的内容
	}
}
