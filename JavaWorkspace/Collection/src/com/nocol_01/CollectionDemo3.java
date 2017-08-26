package com.nocol_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 集合的遍历。其实就是依次获取集合中的每一个元素。
 * 
 * Object[] toArray():把集合转成数组，可以实现集合的遍历
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// 创建对象
		Collection c = new ArrayList();
		// 添加元素
		c.add("hello");// Object obj = "hello"; 向上转型
		c.add("world");
		c.add("java");
		// System.out.println(c);
		// 将集合转换为数组
		Object[] obj = c.toArray();
		// 遍历数组元素，即遍历集合元素
		for (int x = 0; x < obj.length; x++) {
			// System.out.println(obj[x]);
			// 元素是字符串，在获取到元素的的同时，得到元素的长度。
			// System.out.println(objs[x] + "---" + objs[x].length());
			// 上面的实现不了，原因是Object中没有length()方法
			// 我们要想使用字符串的方法，就必须把元素还原成字符串 
			String str = (String) obj[x];//还原字符串 // 向下转型
			System.out.println(str + "-----" + str.length());
		}
	}
}
