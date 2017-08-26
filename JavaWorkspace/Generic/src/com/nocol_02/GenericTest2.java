package com.nocol_02;

import java.util.ArrayList;
import java.util.Iterator;



/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 需求：存储自定义对象并遍历。
 * 
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */

public class GenericTest2 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array=new ArrayList<Student>();
		//创建元素对象
		Student s1=new Student("java",20); 
		Student s2=new Student("android",20);
		Student s3=new Student("jsp",20);
		Student s4=new Student("js",20);
		//添加元素带集合
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		//遍历集合
		//方式一
		Iterator<Student> it=array.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+"------"+s.getAge());  //Student类需要重写toString（）方法，否则打出来的是地址值
		}
		System.out.println("-----------------------------");
		//方式二
		for(int x=0;x<array.size();x++){
			Student ss=array.get(x);
			System.out.println(ss.getName()+"-----"+ss.getAge());
		} 
		System.out.println("-------------------------------");
		//方式三：增强for循环
		for(Student sss:array){
			System.out.println(sss.getName()+"-----"+sss.getAge());
		}
	}
}
