package com.java;

import java.util.ArrayList;
import java.util.List;

/*
 * 题目：数组内存有1-100中的99个数（可重复）,编写程序找出该数组内不存在1-100的数
 * 		
 */
public class Test03_1_100 {
	public static void main(String[] args) {
		int[] arr = new int[99];
		int count=0;		
		List<Integer> list1=new ArrayList<Integer>();	
		
		while(count<99){
			for (int i = 0; i < 99; i++) {
				int num=(int) (Math.random()*100);//随机添加99个整数
				arr[i]=num;
				count++;
				list1.add(arr[i]);
			}
		}

		System.out.println("随机产生的99个数:");
		PrintList(list1);//打印
		
		List<Integer> list2=new ArrayList<Integer>();//list2保存1-100之间的整数
		for (int i = 1; i <=100; i++) {
			list2.add(i);
		}

		List<Integer> list3=new ArrayList<Integer>();//list3用于保存数组中在1-100不存在的数
		for (Integer integer : list2) {
			if(!list1.contains(integer)){
				list3.add(integer);
			}
		}		
		//打印
		System.out.println("1-100之间数组不存在的数:");
		PrintList(list3);
	}
	
	//打印集合中的元素
	private static void PrintList(List<Integer> list) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for (int i = 0; i < list.size(); i++) {
			if(i==list.size()-1){
				sb.append(list.get(i)).append("]");
			}else {
				sb.append(list.get(i)+", ");
			}
		}
		System.out.println(sb);
	}
}

