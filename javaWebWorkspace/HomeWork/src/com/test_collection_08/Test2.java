package com.test_collection_08;

import java.util.TreeSet;

/*
 * ��дһ����Teacher
��id name age����

��д���е�equals������������������ͬ���ж������޸�Ϊ id��ͬ�Լ�name��ͬ�Լ�age��ͬ������� �������������ͬ��

��д��������в���
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		TreeSet<Teacher> set = new TreeSet<Teacher>();

		Teacher t1 = new Teacher(1, "t1", 25);
		Teacher t2 = new Teacher(2, "t1", 25);
		Teacher t3 = new Teacher(1, "t2", 26);
		Teacher t4 = new Teacher(1, "t1", 25);
		Teacher t5 = new Teacher(3, "t3", 27);
		Teacher t6 = new Teacher(1, "t1", 25);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);

		for (Teacher teacher : set) {
			System.out.println(teacher);
		}
	}
}
