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
 * 键：Student
 * 		要求：如果两个对象的成员变量值都相同，则为同一个对象。
 *                           //要求对象所属类重写hashcode()和equals()方法保证唯一
 * 值：String
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		//创建集合对象
		 HashMap<Student, String> hm=new HashMap<Student,String>();
		//创建元素对象
		 Student s1=new Student("java",27);
		 Student s2=new Student("jsp",30);
		 Student s3=new Student("js",28);
		 Student s4=new Student("xml",35);
		 Student s5=new Student("java",27);
		 Student s6=new Student("xml",35);
		//添加元素对象到集合
		 hm.put(s1, "001");
		 hm.put(s2, "002");
		 hm.put(s3, "003");
		 hm.put(s4, "004");
		 hm.put(s5, "005");
		 hm.put(s6, "006");
		 //遍历集合
		 Set<Student> set=hm.keySet();
		 for(Student key:set){
			 String value=hm.get(key);
			 System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		 }
	}
}
