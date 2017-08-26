package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 数组排序之冒泡排序：
 * 		相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
 */
public class BubbleSort {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);//本类中不用类名.方法名
		
		/*
		// 第一次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 0是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 0; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第一次比较后：");
		printArray(arr);

		// 第二次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 1是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 1; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第二次比较后：");
		printArray(arr);

		// 第三次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 2是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 2; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第三次比较后：");
		printArray(arr);

		// 第四次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 3是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 3; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第四次比较后：");
		printArray(arr);
		*/
		// 上面的代码重复度太高了，所以用循环改进
		// for (int y = 0; y < 4; y++) {
		// for (int x = 0; x < arr.length - 1 - y; x++) {
		// if (arr[x] > arr[x + 1]) {
		// int temp = arr[x];
		// arr[x] = arr[x + 1];
		// arr[x + 1] = temp;
		// }
		// }
		// }

		/*
		// 由于知道比较的次数是数组长度-1次，所以改进最终版程序
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
		System.out.println("排序后：");
		printArray(arr);
		*/
		
		//调用冒泡排序功能排序
		System.out.println("排序后：");
		bubbleSort(arr); 
		printArray(arr); //用遍历方式打印出排序后的数组
	}
	//冒泡排序的功能
	public static void bubbleSort(int[] arr){
		//外层循环控制循环次数
		for(int x=0;x<arr.length-1;x++){
		//内层控制遍历次数
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]<arr[y+1]){
					int tem=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=tem;	
				}
			}
		}
	}
	//定义排序前遍历并拿到数组元素的功能
	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.print(arr[x]);
				System.out.println("]");
			}else{
				System.out.print(arr[x]+", ");
			}
		}
	}
}
