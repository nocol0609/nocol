package com.spring.yilai;

public class Student {
	private String name;
	private int age;
	
	/**
	 * 此时并没有无参构造,获取对象时异常，可通过依赖注入方式 注入构造函数的参数
	 */
	
	public Student(String name, int age) {
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
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
