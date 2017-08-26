package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class Test03_xyz {
	public static void main(String[] args) {
		System.out.println("请输入三个整数：");
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		List<Integer> list=new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(z);
		//将list转为数组
		Object[] arr = list.toArray();		
		Arrays.sort(arr);//排序
		//遍历输出
		for (Object object : arr) {
			System.out.println(object);
		}
	}
}
