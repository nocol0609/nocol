package com.nocol_01;

import java.util.ArrayList;
import java.util.Collection;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 * 
 * 分析：
 * A:创建学生类
 * B:创建集合对象
 * C:创建学生对象
 * D:把学生添加到集合
 * E:把集合转成数组
 * F:遍历数组
 */
//创建学生类
class Student{
	private String name;
	private int age;
	public Student() {
		super();
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
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class CollectionDemo3Test {
	public static void main(String[] args) {
		//创建集合对象
		Collection c=new ArrayList();
		//创建学生对象
		Student s=new Student();
		// 创建学生对象
		Student s1 = new Student("java", 27);
		Student s2 = new Student("android", 30);
		Student s3 = new Student("jsp", 33);
		Student s4 = new Student("xml", 25);
		Student s5 = new Student("php", 22);
		//将学生对象存进集合
		c.add(s1); 
		c.add(s2); 
		c.add(s3); 
		c.add(s4); 
		c.add(s5); 
		//将集合转为数组
		Object[] obj=c.toArray();
		//遍历数组
		for(int x=0;x<obj.length;x++){
			//System.out.println(obj[x]);
			
			Student ss=(Student)obj[x];//向下转型，还原成学生
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}
	}
}
