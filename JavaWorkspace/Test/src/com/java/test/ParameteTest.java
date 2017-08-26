package com.java.test;

class Student {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class ParameteTest {
	private int num;
	private Student student = new Student();

	public ParameteTest() {
		num = 89;
		student.setName("zhang");
	}

	public void test(int a, Student student) {
		a = 50;
		student.setName("wang");
	}

	public static void main(String[] args) {
		ParameteTest pt = new ParameteTest();
		pt.test(pt.num, pt.student);
		System.out.println(pt.num + ":" + pt.student.getName()); //89,wang
	}
}
