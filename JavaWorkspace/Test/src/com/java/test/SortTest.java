package com.java.test;

public class SortTest {
	public static void main(String[] args) {

		int arr[] = { 2, 6, 9, 3, 6, 8 };
		System.out.println("排序前：");
		printArray(arr);
		System.out.println("使用冒泡排序后：");
		BbbleSort(arr);
		printArray(arr);
		System.out.println("使用选择排序后：");
		SelectSort(arr);
		printArray(arr);
	}
	//选择排序
	private static void SelectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;					
				}
			}
		}
	}

	// 冒泡排序
	private static void BbbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){//循环次数
			for(int j=0;j<arr.length-1-i;j++){//遍历次数
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
	//打印数组
	private static void printArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {
				sb.append(arr[i] + ",");
			}
		}
		System.out.println(sb);
	}
}
