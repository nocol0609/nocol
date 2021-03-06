package com.test_01;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 
 * 使用TreeSet和Comparator，写TreeSetTest2
 * 
 * 要求：对TreeSet中的元素1，2，3，4，5，6，7，8，9，10进行排列， 排序逻辑为奇数在前偶数在后，奇数按照升序排列，偶数按照降序排列
 */
public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {
			int r = 0;

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				// if (i2 % 2 == 0) {
				// return i2 - i1;//若结果为正整数，i2和i1交换位置， 若为负整数则不交换
				// }
				// return i1 - i2;//
				if (i1 % 2 != i2 % 2) {
					r = (i2 % 2 - i1 % 2);
				} else if (i1 % 2 != 1) {
					if (i1 > i2)
						r = -1;
					else if (i1 < i2)
						r = 1;
				} else if (i1 % 2 != 0) {
					if (i1 > i2)
						r = 1;
					else if (i1 < i2)
						r = -1;
				} 
				return r;
			}
		});
		// 添加元素
		for (int i = 1; i <= 10; i++) {
			ts.add(i);
		}
		// 遍历
		for (Integer ig : ts) {
			System.out.println(ig);
		}
	}
}
