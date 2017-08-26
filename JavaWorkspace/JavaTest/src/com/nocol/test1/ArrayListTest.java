package com.nocol.test1;

import java.util.ArrayList;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 去除ArrayList中相同的元素
 */
public class ArrayListTest {
	public static void main(String[] args) {
		// 创建集合
		ArrayList<String> array = new ArrayList<String>();
		// 添加集合元素
		array.add("hello");
		array.add("java");
		array.add("java");
		array.add("hello");
		array.add("xml");
		array.add("android");
		// 创建新集合
		ArrayList<String> newarray = new ArrayList<String>();

		// 遍历老集合
		for (String s : array) {
			if (!newarray.contains(s)) {
				newarray.add(s);
			}
		}
		// 遍历新集合
		for (String s : newarray) {
			System.out.println(s);  //hello，java，xml，android
		}
		System.out.println(array);
	}
}
