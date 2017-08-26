package com.set_son_test;

import java.util.HashSet;
import java.util.Random;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 
 * 分析：
 * 		A:创建随机数对象
 * 		B:创建一个HashSet集合             //可去重（唯一性）
 * 		C:判断集合的长度是不是小于10
 * 			是：就创建一个随机数添加
 * 			否：不搭理它
 * 		D:遍历HashSet集合
 */
public class HashSetTest {
	public static void main(String[] args) {
		//创建随机数对象
		Random r=new Random();
		//创建HashSet集合
		HashSet<Integer> hs=new HashSet<Integer>();
		//判断集合长度是否小于10
		while(hs.size()<10){  //若集合长度小于10则产生随机数，若不判断的话产生的10个随机数可能会有重复
			int num=r.nextInt(20)+1;//0到20 
			hs.add(num); 
		}
		//遍历集合
		for(Integer i:hs){
			System.out.println(i);
		}
	}
}
