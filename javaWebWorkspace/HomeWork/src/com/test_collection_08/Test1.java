package com.test_collection_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ��д��Student
 ��id name age score ����
�Ѿ���Ӧ��get��set����

�ڲ�������������� ʹ��List���ϣ�����5��Student���Ѷ���ŵ�������

�Ѽ���ʹ�õ������ķ�ʽ���б������õ������е�ÿһ��Ԫ�ض��󣬲���ֱ�Ӵ�ӡ����
��ʹ��forѭ���ķ�ʽ �����ȥ���������õ�ÿһ��Ԫ�ز��Ҵ�ӡ����

����дstudent����toString�������Ѷ���ĸ�������ֵ��toString�з��أ�Ȼ�������в������е������� �鿴���
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

		System.out.println("ʹ�õ�����������");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}

		System.out.println("ʹ����ͨforѭ��������");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("ʹ����ǿforѭ��������");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
