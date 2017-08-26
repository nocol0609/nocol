package com.test_collection_08;

public class Teacher implements Comparable<Teacher> {
	private int id;
	private String name;
	private int age;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Teacher t) {
		// TODO Auto-generated method stub
		//比较id（升序）
		int num = this.id - t.id;
		//id相同下比较name内容（升序）
		int num2 = num == 0 ? this.name.compareTo(t.name) : num;
		//id和name都相同的情况下比较age（升序）
		int num3 = num2 == 0 ? this.age - t.age : num2;
		return num3;
	}

}
