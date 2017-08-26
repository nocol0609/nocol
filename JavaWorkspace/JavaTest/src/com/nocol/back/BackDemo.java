package com.nocol.back;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 返回值类型
 *         基本类型: 
 *         引用类型：
 *                 类:返回的是该类的对象
 *                 抽象类: 
 *                 接口:
 */
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public Student getStudent() {       //相比基本返回类型  public void getStudent(){}
		
		// Student s = new Student();
		// return s;
		
		return new Student();
	}
}

class BackDemo {
	public static void main(String[] args) {
		// 需求：我要使用Student类中的study()方法
		// 但是要求是，不要直接创建Student的对象
		// 让你使用StudentDemo帮你创建对象
		StudentDemo sd = new StudentDemo();
		//原本就是 sd.getStudent();即可，但是有返回值，即用Student的对象s接收
		
		Student s = sd.getStudent(); // new Student(); Student s = new Student();
		s.study();
	}
}
