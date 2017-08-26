package com.nocol_06;
/**
* @author lxp
*
* @TODO  StringTest2 方法改进版
* 
*/
/*
 * 统计大串中小串出现的次数
 * 举例：
 * 		在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * 结果：
 * 		java出现了5次
 * 
 * 分析：
 * 		前提：是已经知道了大串和小串。
 * 
 * 		A:定义一个统计变量，初始化值是0
 * 		B:先在大串中查找一次小串第一次出现的位置
 * 			a:索引是-1，说明不存在了，就返回统计变量
 * 			b:索引不是-1，说明存在，统计变量++
 * 		C:把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		D:回到B
 */
public class StringTest3{
	public static void main(String[] args) {
		//定义大串
		String maxString="woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//定义小串
		String minString="java";	
		//调用功能实现
		int count=StringTest2.getCount(maxString, minString);
		System.out.println("java在大串中出现的次数为"+count+"次");
	}
	public static int getCount(String maxString,String minString ){
		//定义统计变量
		int count=0;
		
		/*//先先在大串中查找一次小串第一次出现的位置
		int index=maxString.indexOf(minString);
		
		while(index!=-1){
			count++;
			// 把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，
			// 并把该字符串的值重新赋值给大串
			int startIndex=index+minString.length();
			maxString=maxString.substring(startIndex);
			//继续查
			index=maxString.indexOf(minString);
		}*/
		//方法改进
		int index;
		while((index=maxString.indexOf(minString))!=-1){
			count++;
			maxString=maxString.substring(index+minString.length());
		}
		return count;
	}
}
