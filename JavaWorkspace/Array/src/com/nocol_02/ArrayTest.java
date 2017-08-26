package com.nocol_02;

import com.nocol_01.BubbleSort;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 把字符串中的字符进行排序。
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串转换为字符数组
 * 		C:把字符数组进行排序
 * 		D:把排序后的字符数组转成字符串
 * 		E:输出最后的字符串
 */
public class ArrayTest {
	public static void main(String[] args) {
		//定义一个字符串
		String s="dacgebf";
		System.out.println("排序前的字符串为："+s);
		//把字符串转换为字符数组
		char[] chs=s.toCharArray();
		//把字符数组进行排序
	    bubbleSort(chs);
		//把排序后的字符数组转成字符串
		String result=String.valueOf(chs);
		//输出最后的字符串
		System.out.println("排序后的字符串为："+result);
	}
   //定义冒泡排序
	private static void bubbleSort(char[] chs) {
		// TODO Auto-generated method stub
		for(int x=0;x<chs.length-1;x++){
			for(int y=0;y<chs.length-1-x;y++){
				if(chs[y]>chs[y+1]){   //更大的放到前面
					char tem=chs[y];
					chs[y]=chs[y+1];
					chs[y+1]=tem;
				}
			}
		}
	}
}
