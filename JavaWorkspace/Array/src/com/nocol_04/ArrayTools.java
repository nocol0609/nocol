package com.nocol_04;

import java.util.Arrays;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Arrays:针对数组进行操作的工具类。比如说排序和查找。
 * 1:public static String toString(int[] a) 把数组转成字符串
 * 2:public static void sort(int[] a) 对数组进行排序,底层是快速排序
 * 3:public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArrayTools {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) 把数组转成字符串
		String result=Arrays.toString(arr);//类似前面手动拼接
		System.out.println("排序前：" + result);

		// public static void sort(int[] a) 对数组进行排序
		Arrays.sort(arr); //底层快速排序，数组元素升序排序
		System.out.println("排序后：" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) 二分查找
		int result2=Arrays.binarySearch(arr, 57); 
		System.out.println("binarySearch:" +result2); //2
		int result3=Arrays.binarySearch(arr, 577); 
		System.out.println("binarySearch:" + result3);
	}
}
