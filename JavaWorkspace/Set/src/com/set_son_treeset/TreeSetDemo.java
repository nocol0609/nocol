package com.set_son_treeset;

import java.util.TreeSet;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * TreeSet：能够对元素按照某种规则进行排序。
 * 排序有两种方式
 * A:自然排序
 * B:比较器排序
 * 
 * TreeSet集合的特点：排序和唯一
 * 
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		// 自然顺序进行排序
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// 创建元素并添加
		// 20,18,23,22,17,24,19,18,24
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);

		// 遍历
		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}
