package com.set_son_hashset;

import java.util.HashSet;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ�ء�

       //����������Ӧ����дhashcode��equals����
 * 
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs=new HashSet<Student>();
		//����ѧ������
		Student s1=new Student("java",27);
		Student s2=new Student("jsp",28);
		Student s3=new Student("java",27);
		Student s4=new Student("java",30);
		Student s5=new Student("xml",27);
		//����ѧ�����󵽼���
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		//��������
		for(Student s:hs){
			System.out.println(s.getName()+"-----"+s.getAge());
		} 
		
	}
}