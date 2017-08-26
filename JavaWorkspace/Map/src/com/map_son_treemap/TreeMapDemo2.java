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
 * 键:Student
 * 值：String
 * 
 *         TreeMap特点之一是排序，所以TreeMap自定义存储时需给出排序规则
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		TreeMap<Student, String> tm=new TreeMap<Student,String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				//主要排序条件:年龄从小到大
				int num=s1.getAge()-s2.getAge();
				//次要条件：年龄相同名字不一定相同
				int num2=num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		//创建元素对象
		Student s1=new Student("java",27);
		Student s2=new Student("jsp",28);
		Student s3=new Student("js",29);
		Student s4=new Student("xml",32);
		Student s5=new Student("java",27);
		//添加对象到集合
		tm.put(s1, "001");
		tm.put(s2, "002");
		tm.put(s3, "003");
		tm.put(s4, "004");
		tm.put(s5, "005");
		//遍历集合
		Set<Student> set=tm.keySet();
		for(Student key:set){
			String value=tm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}
}
