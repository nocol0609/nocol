package com.map_son_hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * HashMap<Student,String>
 * 
 * ����Student
 * 		Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ������
 *                           //Ҫ�������������дhashcode()��equals()������֤Ψһ
 * ֵ��String
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		//�������϶���
		 HashMap<Student, String> hm=new HashMap<Student,String>();
		//����Ԫ�ض���
		 Student s1=new Student("java",27);
		 Student s2=new Student("jsp",30);
		 Student s3=new Student("js",28);
		 Student s4=new Student("xml",35);
		 Student s5=new Student("java",27);
		 Student s6=new Student("xml",35);
		//���Ԫ�ض��󵽼���
		 hm.put(s1, "001");
		 hm.put(s2, "002");
		 hm.put(s3, "003");
		 hm.put(s4, "004");
		 hm.put(s5, "005");
		 hm.put(s6, "006");
		 //��������
		 Set<Student> set=hm.keySet();
		 for(Student key:set){
			 String value=hm.get(key);
			 System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		 }
	}
}
