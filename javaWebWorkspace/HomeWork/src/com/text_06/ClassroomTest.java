package com.text_06;

public class ClassroomTest {
	public static void main(String[] args) {
		// ����Classroom����
		Classroom cr = new Classroom();

		// ����Teacher���󣬲���Teacher���䵽Classroom��
		Teacher t = new Teacher(1, "nokia", 100, 001, 25);
		cr.setTeacher(t);
		// ����3��Student���󣬲���Student���䵽Classroom��
		Student s1 = new Student(1, "tom", 18);
		Student s2 = new Student(2, "jack", 19);
		Student s3 = new Student(3, "rose", 20);

		cr.addStudent(1,s1);
		cr.addStudent(2,s2);
		cr.addStudent(3,s3);
		// ����Classroom�е��������������Է�����ҵ���߼��Ƿ�׼ȷ
		int num = cr.getStudentNum();
		System.out.println(num);// 3
		
//		Student[] students = cr.getStudents();
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i]);
//		}
		cr.print();

	}
}
