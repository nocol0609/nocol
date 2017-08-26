package com.nocol.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * class Teacher implements Comparable<Object>{ 
 * private String name; 
 * private int age;
 * 
 * public Teacher() { super();  }
 * 
 * public Teacher(String name, int age) { 
 * super(); 
 * this.name = name; 
 * this.age =age; 
 * }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public int getAge() { return age; }
 * 
 * public void setAge(int age) { this.age = age; }
 * 
 * @Override public String toString() { 
 * return "Teacher [name=" + name + ", age=" + age + "]"; }
 * 
 * @Override public int compareTo(Object o) {
 * //��Ȼ����Ĭ������ 
 * // TODO Auto-generated
 * method stub Teacher teacher=(Teacher)o; 
 * //�������� 
 * //��ǰ��ȥ���룺����
 *  //return this.age-teacher.age; 
 *  //�����ȥ��ǰ�ǣ����� 
 *  //return teacher.age-this.age; 
 *  
 *  //��������
 * //return teacher.name.compareTo(this.name);����
 *   return this.name.compareTo(teacher.name);//����
 * 
 * }
 * 
 * }
 */
class Teacher  {
	private String name;
	private int age;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age) {
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
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
}

class TeacherCompartor implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Teacher t1=(Teacher) o1;
		Teacher t2=(Teacher) o2;
		
		if(t1.getAge()>t2.getAge()) return 1;
		
		else if (t1.getAge()<t2.getAge()) return -1;
		
		else return 0;
			
	}
	
}

public class TreeSetTest {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("tom", 20);
		Teacher t2 = new Teacher("rose", 21);
		Teacher t3 = new Teacher("jack", 22);
	//	TreeSet<Teacher> ts = new TreeSet<Teacher>();
		
		TeacherCompartor tCompartor=new TeacherCompartor();
		TreeSet<Teacher> ts=new TreeSet<Teacher>(tCompartor);

		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		for (Teacher t : ts) {
			System.out.println(t);
		}
		
		short s1=1;
		//s1=(int)s1+1;
		
		short s2=1;
		s2+=1;
	}
}