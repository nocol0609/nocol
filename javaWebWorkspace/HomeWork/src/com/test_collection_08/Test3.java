package com.test_collection_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * List�����д����10���ַ�����������һ�����ַ�������ͬ�ģ��������Set���ϣ����԰��ظ��Ķ�������ȥ����
 * 
 */
public class Test3 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("tom");
		list.add("jack");
		list.add("tom");
		list.add("nocol");
		list.add("rose");
		list.add("tom");
		
		Set<String> set=new TreeSet<String>();
		
		for (String string : list) {
			set.add(string);
		}
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}
}
