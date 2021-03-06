package com.test_01;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 使用TreeSet和Comparator,写TreeSetTest1
 * 要求：对TreeSet中的元素"HashSet"、"ArrayList"、"TreeMap"、"HashMap"、"TreeSet"、
 * "LinkedList"进行升序和倒序排列
 * 
 */
public class TreeSetTest1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
			//升序
			@Override
			public int compare(String s1, String s2) {
				//不换位置 返回 -1；换位置返回 1
				if (s1.compareTo(s2) > 0) {
					return 1;//如果按字典顺序此 String 对象位于参数字符串之后，则比较结果为一个正整数
				} else if (s1.compareTo(s2) < 0) {
					return -1;//如果按字典顺序此 String 对象位于参数字符串之前，则比较结果为一个负整数
				} else {
					return 0;
				}
			}
		});
		ts.add("HashSet");
		ts.add("ArrayList");
		ts.add("TreeMap");
		ts.add("HashMap");
		ts.add("TreeSet");
		ts.add("LinkedList");

		for (String s : ts) {
			System.out.println(s);
		}

	}
}
