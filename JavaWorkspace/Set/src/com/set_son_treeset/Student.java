package com.set_son_treeset;
/**
* @author lxp
*
* @TODO 
* 
*/
public class Student implements Comparable<Student>  {
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student s) {
		//��Ҫ��������Ȼ���򣬰��������С��������
		int num=this.age-s.age;
		// ��Ҫ����
		// ������ͬ��ʱ�򣬻���ȥ�������Ƿ�Ҳ��ͬ
		// ����������������ͬ������ͬһ��Ԫ��
		int num2=num==0?this.name.compareTo(s.name):num;
		return num2;
		
		//�����ֳ��������߼�
		
		/*
			// ��Ҫ���� �����ĳ���
			int num = this.name.length() - s.name.length();
			// �����ĳ�����ͬ��������������������ͬ
			int num2 = num == 0 ? this.name.compareTo(s.name) : num;
			// �����ĳ��Ⱥ�������ͬ��������������ͬ�����Ի��ü����ж�����
			int num3 = num2 == 0 ? this.age - s.age : num2;
			return num3;
		*/
	}
}
