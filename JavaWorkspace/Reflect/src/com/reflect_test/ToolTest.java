package com.reflect_test;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class ToolTest {
	public static void main(String[] args) throws Exception {
		//��������
		Tool t=new Tool();
		Person p=new Person();
		t.setProperty(p, "name","��˧��");
		t.setProperty(p, "age", 27);
		System.out.println(p);
		System.out.println("--------");
		
		Dog d=new Dog();
		t.setProperty(d, "sex", '��');
		t.setProperty(d, "price", 13.14f);
		System.out.println(d);
	}
}

class Dog {
	char sex;
	float price;

	@Override
	public String toString() {
		return sex + "---" + price;
	}
}

class Person {
	private String name;
	public int age;

	@Override
	public String toString() {
		return name + "---" + age;
	}
}