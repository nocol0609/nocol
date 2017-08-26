package com.test_collection_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 编写类Student
 有id name age score 属性
已经对应的get、set方法

在测试类的主函数中 使用List集合，创建5个Student，把对象放到集合中

把集合使用迭代器的方式进行遍历，拿到集合中的每一个元素对象，并且直接打印出来
在使用for循环的方式 方便的去遍历集合拿到每一个元素并且打印出来

再重写student类中toString方法，把对象的各个属性值在toString中返回，然后再运行测试类中的主函数 查看结果
 */
public class Test1 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(001, "s1", 18, 85);
		Student s2 = new Student(002, "s2", 19, 86);
		Student s3 = new Student(003, "s3", 20, 87);
		Student s4 = new Student(004, "s4", 21, 88);
		Student s5 = new Student(005, "s5", 22, 89);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		System.out.println("使用迭代器遍历：");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}

		System.out.println("使用普通for循环遍历：");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("使用增强for循环遍历：");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
