package com.nocol.args;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ��ʽ������ �������� �������� ����:(���������ʱ����ʵ�����Ѿ�������) ��Ҫ���Ǹ���Ķ��� ������: �ӿ�
 */
// ����ѧ����
class Student {
	public void study() {
		System.out.println("study");
	}
}

// ����ѧ��Demo��
class StudentDemo {
	public void method(Student s) { // ��ͨ�൱����
		s.study();
	}
}

// ������
public class ArgsDmeo {
	public static void main(String[] args) {
		// ����1������Student���study()����
		Student s = new Student();
		s.study();
		System.out.println("----------------------");
		// ����2����Ҫ����StudentDemo���е�method()����
		StudentDemo sd = new StudentDemo();
		// ԭ����sd.method(Student s),��ʱ�������ܵ��βΣ����Դ�ʱҪ
		// �ľ��Ǹ�Student��Ķ���
		Student ss = new Student(); // ����Student�����һ������
		sd.method(ss);
	}
}
