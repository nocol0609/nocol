package com.nocol.duotai;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 不同地方饮食文化不同的案例
 * 对象间的转型问题：
		向上转型：
			Fu f = new Zi();
		向下转型：
			Zi z = (Zi)f; //要求该f必须是能够转换为Zi的。
 */
class Person {
	public void eat() {
		System.out.println("吃饭");
	}
}

class SouthPerson extends Person {
	public void eat() {
		System.out.println("炒菜,吃米饭");
	}

	public void jingShang() {
		System.out.println("经商");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("炖菜,吃馒头");
	}

	public void yanJiu() {
		System.out.println("研究");
	}
}

class DuoTaiDemo2 {
	public static void main(String[] args) {
		// 测试
		// 南方人
		Person p = new SouthPerson();  //向上转型，即将父类对象p定义为 南方人（SouthPerson）
		p.eat();   //SouthPerson继承person，子类重写父类eat()方法
		System.out.println("-------------");
		SouthPerson sp = (SouthPerson) p; //向下转型，即还原南方人，使父类对象p拥有子类对象sp的访问权限
		sp.eat();
		sp.jingShang();
		System.out.println("-------------");

		// 北方人
		p = new NorthPerson();
		p.eat();
		System.out.println("-------------");
		NorthPerson np = (NorthPerson) p;
		np.eat();
		np.yanJiu();
	}
}