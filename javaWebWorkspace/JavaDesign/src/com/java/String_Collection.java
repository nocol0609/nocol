package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 写一个方法,参数接收一个String类型的对象，最终可以把这个字符串参数中出现过的每一个字母打印出来
例如:  "wwqweqdasdafdsfdsferer"
将来方法接收这个参数后会打印: w q e d a s f r    
 
         在之前作业的基础上,不仅要输出出现过的字符还要输出每个字符出现了多少次
 */
public class String_Collection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String line = sc.nextLine();
		sc.close();
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

		// 创建新集合去重
		List<String> newList = new ArrayList<>();
		for (String string : list) {
			if (!newList.contains(string)) {
				newList.add(string);
			}
		}
		
		for(int i=0;i<newList.size();i++){
				int count=0;
			for(int j=0;j<list.size();j++){
				if(newList.get(i).equals(list.get(j))){
					count++;
				}
			}
			System.out.println(newList.get(i)+"出现了"+count+"次");
		}
		
//		for (String string : newList) {
//			System.out.println("字符"+string+"出现了"+count+"次");
//		}
			
	}
}
