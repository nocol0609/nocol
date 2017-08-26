package com.nocol_03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 有如下一个字符串:"91 27 46 38 50"（注意是字符串，不是数组）
 * 请写代码实现最终输出结果是："27 38 46 50 91"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串进行分割，得到一个字符串数组
 * 		C:把字符串数组变换成int数组
 * 		D:对int数组排序
 * 		E:把排序后的int数组在组装成一个字符串
 * 		F:输出字符串
 */
public class FengeTest2 {
	public static void main(String[] args) {
		String s1="91 27 46 38 50";
		String regex=" ";
		String[] strArray=s1.split(regex);
		//把字符串数组变换成int数组
		int[] arr=new int[strArray.length];//int数组与字符串数组长度相同
		
		for (int x = 0; x < arr.length; x++) {
			arr[x]=Integer.parseInt(strArray[x]);
		}
		//对int数组进行排序
		Arrays.sort(arr);
		
		//把排序后的int数组在组装成一个字符串
		
		/*StringBuilder sb=new StringBuilder();
		for (int x = 0; x < arr.length; x++) {
			sb.append(arr[x]).append(" ");
		}*/
		
		String s="";
		for(int x=0;x<arr.length;x++){
			s+=arr[x];
			s+=" ";
		}
		
		//转化为字符串
		String result = s.toString().trim(); //均是String类下的方法
		System.out.println(result);
	}
}
