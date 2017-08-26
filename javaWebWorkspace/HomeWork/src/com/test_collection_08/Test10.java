package com.test_collection_08;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * 写一个类Student
id
name
score

把学生对象放到集合中排序
按照学生分数从高到低排(名字叫tom的学生特殊照顾一下，无论多少分都要排在第一名)
 */
public class Test10 {

	public static void main(String[] args) {
		
		TreeSet<Student2> set = new TreeSet<Student2>(new Comparator<Student2>() {

			@Override
			public int compare(Student2 s1, Student2 s2) {
				// TODO Auto-generated method stub
				int num = s2.getScore() - s1.getScore();
				int num2 = num == 0 ? s2.getName().compareTo(s1.getName()) : num;
				int num3 = num2 == 0 ? s2.getId() - s1.getId() : num2;
				return num3;
			}
		});

		Student2 s1 = new Student2(1, "jack", 75);
		Student2 s2 = new Student2(2, "rose", 84);
		Student2 s3 = new Student2(3, "nocol", 75);
		Student2 s4 = new Student2(4, "nokia", 88);
		Student2 s5 = new Student2(5, "tom", 50);
		
		 
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);

		List<Student2> list=new LinkedList<Student2>();
		for (Student2 student2 : set) {
			//System.out.println(student2);
			if(student2.getName().equals("tom")){
				list.add(0, student2);
			}else {
				list.add(student2);
			}
		}
		
		for (Student2 student2 : list) {
			System.out.println(student2);
		}
		
	}
}
