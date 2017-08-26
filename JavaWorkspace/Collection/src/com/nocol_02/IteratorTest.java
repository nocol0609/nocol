package com.nocol_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 
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
public class IteratorTest {
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
		
		Student s5 = new Student();
		s4.setName("php");
		s4.setAge(26);
		
		//将学生对象存进集合
		c.add(s1); 
		c.add(s2); 
		c.add(s3); 
		c.add(s4); 
		c.add(s5); 
		//c.add(new Student("js",20)); //创建并添加
		//使用集合专用遍历方式遍历
		Iterator it=c.iterator();
	
		//获取元素并输出
		while(it.hasNext()){
			//System.out.println(it.next());
			Student ss=(Student)it.next();
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}
		
		//用for循环效率更高，用完it就变成垃圾了
		/*for(Iterator it=c.iterator();it.hasNext();){
			Student ss=(Student)it.next();
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}*/
	}
}
