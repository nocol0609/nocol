package com.nocol.back;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ����ֵ����
 *         ��������: 
 *         �������ͣ�
 *                 ��:���ص��Ǹ���Ķ���
 *                 ������: 
 *                 �ӿ�:
 */
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public Student getStudent() {       //��Ȼ�����������  public void getStudent(){}
		
		// Student s = new Student();
		// return s;
		
		return new Student();
	}
}

class BackDemo {
	public static void main(String[] args) {
		// ������Ҫʹ��Student���е�study()����
		// ����Ҫ���ǣ���Ҫֱ�Ӵ���Student�Ķ���
		// ����ʹ��StudentDemo���㴴������
		StudentDemo sd = new StudentDemo();
		//ԭ������ sd.getStudent();���ɣ������з���ֵ������Student�Ķ���s����
		
		Student s = sd.getStudent(); // new Student(); Student s = new Student();
		s.study();
	}
}
