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
 * 键：String	学号
 * 值：Student 学生对象
 */
public class HashMapDemo3 {
	 public static void main(String[] args) {
		//创建集合对象
		 HashMap<String, Student> hs=new HashMap<String,Student>();
		//创建元素对象
		 Student s1=new Student("java",27);
		 Student s2=new Student("jsp",30);
		 Student s3=new Student("js",28);
		 Student s4=new Student("xml",35);
		 //添加元素对象到集合
		 hs.put("001", s1);
		 hs.put("002", s2);
		 hs.put("003", s3);
		 hs.put("004", s4);
		 //遍历集合
		 Set<String> set=hs.keySet();
		 for(String key:set){
			 Student value=hs.get(key);
			 System.out.println(key+"----"+value.getName()+"---"+value.getAge());
		 }
	}
}
