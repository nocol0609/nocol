package com.map_son_treemap;

import java.util.Set;
import java.util.TreeMap;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * TreeMap:是基于红黑树的Map接口的实现。  //自然排序和唯一
 * 
 * HashMap<String,String>
 * 键：String
 * 值：String
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeMap<String, String> tm = new TreeMap<String, String>();

		// 创建元素并添加元素
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "爪哇");
		tm.put("world", "世界2");
		tm.put("javaee", "爪哇EE");

		// 遍历集合
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
