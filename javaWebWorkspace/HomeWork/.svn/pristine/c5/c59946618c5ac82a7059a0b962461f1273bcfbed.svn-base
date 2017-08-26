package com.test_collection_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 写一个方法,参数接收一个String类型的对象，最终可以把这个字符串参数中出现过的每一个字母打印出来
例如:  "wwqweqdasdafdsfdsferer"
将来方法接收这个参数后会打印: w q e d a s f r    
 */
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String line = sc.nextLine();
		// 打印字母
		System.out.println("打印字母：");
		print(line);
	}

	private static void print(String line) {

		List<String> list = new ArrayList<String>();

		// TODO Auto-generated method stub
		char[] chs = line.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			list.add(Character.toString(chs[i]));
		}
		
		//创建新集合去重
		List<String> newList = new ArrayList<>();
		for (String string : list) {
			if (!newList.contains(string)) {
				newList.add(string);
			}
		}

		for (String string : newList) {
			System.out.println(string);
		}

	}
}
