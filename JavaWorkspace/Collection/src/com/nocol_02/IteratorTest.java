package com.nocol_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
 * 
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
public class IteratorTest {
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
		
		Student s5 = new Student();
		s4.setName("php");
		s4.setAge(26);
		
		//��ѧ������������
		c.add(s1); 
		c.add(s2); 
		c.add(s3); 
		c.add(s4); 
		c.add(s5); 
		//c.add(new Student("js",20)); //���������
		//ʹ�ü���ר�ñ�����ʽ����
		Iterator it=c.iterator();
	
		//��ȡԪ�ز����
		while(it.hasNext()){
			//System.out.println(it.next());
			Student ss=(Student)it.next();
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}
		
		//��forѭ��Ч�ʸ��ߣ�����it�ͱ��������
		/*for(Iterator it=c.iterator();it.hasNext();){
			Student ss=(Student)it.next();
			System.out.println(ss.getName()+"-----"+ss.getAge());
		}*/
	}
}
