package com.creatjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.bean.Person;


/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class CreatJson {
	
	//��ȡ����Person�����
	public  static Person getPerson() {
		Person person = new Person(001,"nocol",20);
		return person;
	}
	
	//��ȡPerson��list���϶���
	public static List<Person> getPersonList(){
		List<Person> list=new ArrayList<Person>();
		Person person1=new Person(101,"jack",25);
		Person person2=new Person(102,"rose",26);
		list.add(person1);
		list.add(person2);
		return list;
	}
	
	//��ȡ�ַ����ļ��϶���
	public static List<String> getStringList(){
		List<String> list=new ArrayList<String>();
		list.add("nokia");
		list.add("daisy");
		return list;
	}
	
	//��ȡList����Ƕ��Map���ϵĶ���
	public  static List<Map<String, Object>> getListMap(){
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map1=new HashMap<String ,Object>();
		map1.put("id", 007);
		map1.put("name", "jack");
		map1.put("age", 25);
		
		Map<String, Object> map2=new HashMap<String ,Object>();
		map2.put("id", 006);
		map2.put("name", "rose");
		map2.put("age", 26);
		
		list.add(map1);
		list.add(map2);
		
		return list;
	}
}