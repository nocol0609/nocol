package com.test_collection_08;

import java.util.TreeSet;

/*
 * 编写一个类Teacher
有id name age属性

重写类中的equals方法，把俩个对象相同的判断条件修改为 id相同以及name相同以及age相同的情况下 俩个对象才算相同。

编写测试类进行测试
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
