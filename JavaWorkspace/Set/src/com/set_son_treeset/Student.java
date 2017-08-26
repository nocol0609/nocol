package com.set_son_treeset;
/**
* @author lxp
*
* @TODO 
* 
*/
public class Student implements Comparable<Student>  {
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int compareTo(Student s) {
		//主要条件：自然排序，按照年龄从小到大排序
		int num=this.age-s.age;
		// 次要条件
		// 年龄相同的时候，还得去看姓名是否也相同
		// 如果年龄和姓名都相同，才是同一个元素
		int num2=num==0?this.name.compareTo(s.name):num;
		return num2;
		
		//按名字长度排序逻辑
		
		/*
			// 主要条件 姓名的长度
			int num = this.name.length() - s.name.length();
			// 姓名的长度相同，不代表姓名的内容相同
			int num2 = num == 0 ? this.name.compareTo(s.name) : num;
			// 姓名的长度和内容相同，不代表年龄相同，所以还得继续判断年龄
			int num3 = num2 == 0 ? this.age - s.age : num2;
			return num3;
		*/
	}
}
