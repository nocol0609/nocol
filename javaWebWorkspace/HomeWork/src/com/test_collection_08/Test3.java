package com.test_collection_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * List集合中存放了10个字符串，其中有一部分字符串是相同的，如何利用Set集合，可以把重复的多余数据去掉？
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
