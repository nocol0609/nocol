package com.java;

/*
 * 随机生成100个数放到数组内，使用多种排序方式排序
 */

public class Sort {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int count = 0;
		while (count < 100) {
			for (int i = 0; i < 100; i++) {
				int number = (int) (Math.random() * 100);
				arr[i] = number;
				count++;
			}
		}
		System.out.println("排序前打印数组：");
		printArry(arr);

		BubbleSort(arr);
		System.out.println("冒泡排序后打印数组：");
		printArry(arr);

		SelectSort(arr);
		System.out.println("选择排序后打印数组：");
		printArry(arr);
		
		//插入排序
		insertSort(arr);
		System.out.println("插入排序后打印数组：");
		printArry(arr);
	}
	
	//插入
	private static void insertSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			int j = i;
			while (j > 0 && arr[i] < arr[j - 1]) {//arr[i]指还未进行排序的数组
				arr[j] = arr[j - 1];
				j--;
			} 
			arr[j] = arr[i];
		}
	}
	
	//选择
	private static void SelectSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		}
	}
	
	//冒泡
	private static void BubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
		}
	}
	
	//打印数组
	private static void printArry(int[] arr) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {
				sb.append(arr[i] + ", ");
			}
		}
		System.out.println(sb);
	}
}
