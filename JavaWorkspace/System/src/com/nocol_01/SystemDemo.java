package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
 * 
 * ������
 * 		public static void gc()������������������ 
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
		System.out.println("��ǰ�Ķ��󱻻�����" + this);
		super.finalize();
	}

}

public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("��˧��", 60);
		System.out.println(p);

		p = null; // ��p����ָ�����ڴ�
		System.gc();
	}
}

