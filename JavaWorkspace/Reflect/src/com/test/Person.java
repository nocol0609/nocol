package com.test;

public class Person {
	private String name;
	public int age;

	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("person 无参构造");
	}

	public Person(String name, int age) {
		System.out.println("person 两个参数构造");
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
	
	
}
