package com.nocol_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 需求：存储字符串并遍历。
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:创建字符串对象
 * 		C:把字符串对象添加到集合中
 * 		D:遍历集合
 */
public class IteratorTest2 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c=new ArrayList();
		//添加数据
		c.add("java");
		c.add("hello");
		c.add("world");
		//遍历集合元素
		Iterator it=c.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}
