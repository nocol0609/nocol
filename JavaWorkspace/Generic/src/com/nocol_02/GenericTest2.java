package com.nocol_02;

import java.util.ArrayList;
import java.util.Iterator;



/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���󣺴洢�Զ�����󲢱�����
 * 
 * A:����ѧ����
 * B:�������϶���
 * C:����Ԫ�ض���
 * D:��Ԫ����ӵ�����
 * E:��������
 */

public class GenericTest2 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array=new ArrayList<Student>();
		//����Ԫ�ض���
		Student s1=new Student("java",20); 
		Student s2=new Student("android",20);
		Student s3=new Student("jsp",20);
		Student s4=new Student("js",20);
		//���Ԫ�ش�����
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		//��������
		//��ʽһ
		Iterator<Student> it=array.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+"------"+s.getAge());  //Student����Ҫ��дtoString���������������������ǵ�ֵַ
		}
		System.out.println("-----------------------------");
		//��ʽ��
		for(int x=0;x<array.size();x++){
			Student ss=array.get(x);
			System.out.println(ss.getName()+"-----"+ss.getAge());
		} 
		System.out.println("-------------------------------");
		//��ʽ������ǿforѭ��
		for(Student sss:array){
			System.out.println(sss.getName()+"-----"+sss.getAge());
		}
	}
}
