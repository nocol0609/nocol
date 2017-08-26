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
 *               类:返回的是该类的对象 
 *               抽象类:返回的是该抽象类的子类的对象 
 *               接口:
 */
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		
		// Person p = new Teacher();
		// return p;

		return new Teacher();
	}
}
//定义抽象类子类
class Teacher extends Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class BackDemo2 {
	public static void main(String[] args) {
		// 需求：我要测试Person类中的study()方法
		PersonDemo pd = new PersonDemo();
		//原本就是 pd.getPerson();即可，但是有返回值，即用抽象类Person的对象p接收，实际为其子类对象
		
		Person p = pd.getPerson(); // new Teacher(); Person p = new Teacher();// 多态							
		p.study();
	}
}