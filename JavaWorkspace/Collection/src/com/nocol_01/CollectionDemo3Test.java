package com.nocol_01;

import java.util.ArrayList;
import java.util.Collection;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б�����
 * 
 * ������
 * A:����ѧ����
 * B:�������϶���
 * C:����ѧ������
 * D:��ѧ����ӵ�����
 * E:�Ѽ���ת������
 * F:��������
 */
//����ѧ����
class Student{
	private String name;
	private int age;
	public Student() {
		super();
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
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class CollectionDemo3Test {
	public static void main(String[] args) {
		//�������϶���
		Collection c=new ArrayList();
		//����ѧ������
		Student s=new Student();
		// ����ѧ������
		Student s1 = new Student("java", 27);
		Student s2 = new Student("android", 30);
		Student s3 = new Student("jsp", 33);
		Student s4 = new Student("xml", 25);
		Student s5 = new Student("php", 22);
		//��ѧ������������
		c.add(s1); 
		c.add(s2); 
		c.add(s3); 
		c.add(s4); 
		c.add(s5); 
		//������תΪ����
		Object[] obj=c.toArray();
		//��������
		for(int x=0;x<obj.length;x++){
			//System.out.println(obj[x]);
			
			Student ss=(Student)obj[x];//����ת�ͣ���ԭ��ѧ��
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}
	}
}
