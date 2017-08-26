package com.map_son_treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * TreeMap<Student,String>
 * ��:Student
 * ֵ��String
 * 
 *         TreeMap�ص�֮һ����������TreeMap�Զ���洢ʱ������������
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		//�������϶���
		TreeMap<Student, String> tm=new TreeMap<Student,String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				//��Ҫ��������:�����С����
				int num=s1.getAge()-s2.getAge();
				//��Ҫ������������ͬ���ֲ�һ����ͬ
				int num2=num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		//����Ԫ�ض���
		Student s1=new Student("java",27);
		Student s2=new Student("jsp",28);
		Student s3=new Student("js",29);
		Student s4=new Student("xml",32);
		Student s5=new Student("java",27);
		//��Ӷ��󵽼���
		tm.put(s1, "001");
		tm.put(s2, "002");
		tm.put(s3, "003");
		tm.put(s4, "004");
		tm.put(s5, "005");
		//��������
		Set<Student> set=tm.keySet();
		for(Student key:set){
			String value=tm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}
}
