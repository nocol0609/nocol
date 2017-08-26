package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 匿名内部类在开发中的使用
 */
interface Person {
	public abstract void study();
}

class PersonDemo {
	
	public void method(Person p) {// 接口名作为形式参数,其实这里需要的不是接口，而是该接口的实现类的对象
	                     
		p.study();
	}
}

// 定义接口实现类
class Student implements Person {
	public void study() {
		System.out.println("study");
	}
}

class InnerClassDemo6 {
	public static void main(String[] args) {
		// 测试
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		System.out.println("-------------------------");

		// 匿名内部类在开发中的使用
		// 匿名内部类的本质是 继承类或者实现了接口的子类匿名对象，所以讲该整体对象当做抽象类Person的子类对象传进去
		                                                         //相当于：new Student();
		pd.method(new Person() {
			public void study() {
				System.out.println("study");
			}
		});
	}
}