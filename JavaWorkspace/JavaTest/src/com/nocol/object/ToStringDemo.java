package com.nocol.object;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * Object类的方法：
 * 
 *            C： public String toString():返回该对象的字符串表示。
 * 
 * Integer类下的一个静态方法： 
 *          public static String toHexString(int i)：把一个整数转成一个十六进制表示的字符串
 * 
 *          但是这个信息是没有任何意义的。所以，建议所有子类都重写该方法。 
 *          
 *          怎么重写呢?
 *                  把该类的所有成员变量值组成返回即可。 重写的最终版方案就是自动生成toString()方法。
 *          
 * 注意： 直接输出一个对象的名称，其实就是调用该对象的toString()方法。
 */
// 定义学生类
class Student2 {     //StudentDemo里已经有Student类
	private String name;
	private int age;

	public Student2() {
		super();
	}

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 重写Object类的toString()方法（自动生成）
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// 重写Object类的toString()方法（手动生成）
	/*
	 * public String toString() { 
	 *	//return super.toString();          //父类Object本身的toString()
	 *  //return "hello";
	 * return "姓名:" + name + ",年龄:" + age; }
	 */
}
//测试类
public class ToStringDemo {
	public static void main(String[] args) {
		Student2 s = new Student2();
	
		System.out.println(s.toString());// 未重写toString()时打印com.nocol.object.Student2@659e0bfd
		System.out.println("--------------------");
		
		// toString()方法的值等价于它
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		// com.nocol.object.Student2@659e0bfd

		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));  //打印最开始的toString（）方法（子类未重写）

		System.out.println(s.toString());  //打印重写后的toString()方法

		// 直接输出对象的名称
		System.out.println(s);   //直接输出一个对象的名称，其实就是调用该对象的toString()方法。可理解为重写后的
	}
}
