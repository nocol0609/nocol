package com.text_06;

public class ClassroomTest {
	public static void main(String[] args) {
		// 创建Classroom对象
		Classroom cr = new Classroom();

		// 创建Teacher对象，并将Teacher分配到Classroom中
		Teacher t = new Teacher(1, "nokia", 100, 001, 25);
		cr.setTeacher(t);
		// 创建3个Student对象，并将Student分配到Classroom中
		Student s1 = new Student(1, "tom", 18);
		Student s2 = new Student(2, "jack", 19);
		Student s3 = new Student(3, "rose", 20);

		cr.addStudent(1,s1);
		cr.addStudent(2,s2);
		cr.addStudent(3,s3);
		// 调用Classroom中的其它方法，测试方法的业务逻辑是否准确
		int num = cr.getStudentNum();
		System.out.println(num);// 3
		
//		Student[] students = cr.getStudents();
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i]);
//		}
		cr.print();

	}
}
