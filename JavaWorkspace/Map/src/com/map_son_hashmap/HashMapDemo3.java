package com.map_son_hashmap;

import java.util.HashMap;
import java.util.Set;

/**author lxp
*
* @TODO 
* 
*/
/*
 * HashMap<String,Student>
 * ����String	ѧ��
 * ֵ��Student ѧ������
 */
public class HashMapDemo3 {
	 public static void main(String[] args) {
		//�������϶���
		 HashMap<String, Student> hs=new HashMap<String,Student>();
		//����Ԫ�ض���
		 Student s1=new Student("java",27);
		 Student s2=new Student("jsp",30);
		 Student s3=new Student("js",28);
		 Student s4=new Student("xml",35);
		 //���Ԫ�ض��󵽼���
		 hs.put("001", s1);
		 hs.put("002", s2);
		 hs.put("003", s3);
		 hs.put("004", s4);
		 //��������
		 Set<String> set=hs.keySet();
		 for(String key:set){
			 Student value=hs.get(key);
			 System.out.println(key+"----"+value.getName()+"---"+value.getAge());
		 }
	}
}
