package com.nocol.args;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 形式参数： 基本类型 引用类型 类名:(匿名对象的时候其实我们已经讲过了) 需要的是该类的对象 抽象类: 接口
 */
// 定义学生类
class Student {
	public void study() {
		System.out.println("study");
	}
}

// 定义学生Demo类
class StudentDemo {
	public void method(Student s) { // 普通类当参数
		s.study();
	}
}

// 测试类
public class ArgsDmeo {
	public static void main(String[] args) {
		// 需求1：测试Student类的study()方法
		Student s = new Student();
		s.study();
		System.out.println("----------------------");
		// 需求2：我要测试StudentDemo类中的method()方法
		StudentDemo sd = new StudentDemo();
		// 原本是sd.method(Student s),当时类名不能当形参，所以此时要
		// 的就是该Student类的对象
		Student ss = new Student(); // 创建Student类的另一个对象
		sd.method(ss);
	}
}
