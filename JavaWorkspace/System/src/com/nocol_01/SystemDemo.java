package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * System类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * 方法：
 * 		public static void gc()：运行垃圾回收器。 
 *		public static void exit(int status)
 *		public static long currentTimeMillis()
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("当前的对象被回收了" + this);
		super.finalize();
	}

}

public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("大帅比", 60);
		System.out.println(p);

		p = null; // 让p不再指定堆内存
		System.gc();
	}
}

