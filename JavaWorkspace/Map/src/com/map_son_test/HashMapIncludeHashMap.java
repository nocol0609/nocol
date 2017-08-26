package com.map_son_test;

import java.util.HashMap;
import java.util.Set;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * HashMap嵌套HashMap
 * 
 * 传智播客
 * 		基础班(jc)
 * 				java		20
 * 				android 	22
 * 		就业班(jy)
 * 				xml		    21
 * 				php		    23
 * 
 * 先存储元素，然后遍历元素
 */
public class HashMapIncludeHashMap {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<String, HashMap<String, Integer>> czmap=new HashMap<String, HashMap<String, Integer>>();
		// 创建基础班集合对象
		HashMap<String, Integer> jcmap=new HashMap<String, Integer>();
		//添加基础班元素对象
		jcmap.put("java", 20);
		jcmap.put("android", 22);
		//添加基础班元素对象到集合
		czmap.put("jc", jcmap) ;
		
		// 创建就业班集合对象
		HashMap<String, Integer> jymap=new HashMap<String, Integer>();
		//添加基础班元素对象
		jymap.put("xml", 21);
		jymap.put("php", 23);
		//添加就业班元素对象到集合
		czmap.put("jy", jymap) ;
		
		//遍历集合
		Set<String> czmapset=czmap.keySet();
		for(String czmapkey:czmapset){
			System.out.println(czmapkey);
			HashMap<String, Integer> czmapvalue=czmap.get(czmapkey);
			Set<String> czmapvalueset=czmapvalue.keySet();
			for(String czmapvaluekey:czmapvalueset){
				Integer czmapvaluevalue=czmapvalue.get(czmapvaluekey);
				System.out.println("\t"+czmapvaluekey+"---"+czmapvaluevalue);
			}
		}
	}
}
