package com.test_array_06;

/*
 * 任务1：创建两个int类型的数组array1和array2，使用{}将array1初始化为8个质数：2，3，5，7，11，13，17和19，
 * 显示array1的内容。
 * 任务2：赋值array2=array1，修改array2中的偶索引元素，使其等于索引值，显示array1中的内容，看看有什么变化。
 */
public class test3 {
	public static void main(String[] args) {

		int[] array1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };
		// 打印array1
		System.out.println("打印array1：");
		printArry(array1);
		
		//将array1赋给arrray2
		int[] array2=new int[]{};
		array2=array1;
		array2[0]=0;
		array2[2]=2;
		array2[4]=4;
		array2[6]=6;
		
		//打印array2
		System.out.println("打印array1：");
		printArry(array1);
		System.out.println("打印array2：");
		printArry(array2);
	}

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
