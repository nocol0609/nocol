package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 数组排序之选择排序：
 * 		从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
 */
public class SelectSort {
	public static void main(String[] args) {
		//定义一个数组
				int[] arr = { 24, 69, 80, 57, 13 };
				System.out.println("排序前：");
				printArray(arr);
		//调用选择排序功能
				System.out.println("排序后：");
				selectSort(arr); 
				printArray(arr);
				/*
				// 第一次
				int x = 0;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("第一次比较后：");
				printArray(arr);

				// 第二次
				x = 1;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("第二次比较后：");
				printArray(arr);

				// 第三次
				x = 2;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("第三次比较后：");
				printArray(arr);

				// 第四次
				x = 3;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("第四次比较后：");
				printArray(arr);
				*/
				
				/*
				//通过观察发现代码的重复度太高，所以用循环改进
				for(int x=0; x<arr.length-1; x++){
					for(int y=x+1; y<arr.length; y++){
						if(arr[y] <arr[x]){
							int temp = arr[x];
							arr[x] = arr[y];
							 arr[y] = temp;
						}
					}
				}
				System.out.println("排序后：");
				printArray(arr);
				*/
	}
	//选择排序功能
	public static void selectSort(int[] arr){
		//外层控制循环次数
		for(int x=0;x<arr.length-1;x++){
			//内层控制遍历次数（int y=x+1，开始比较的索引变大后比较次数减少）
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<arr[x]){
					int tem=arr[y];
					arr[y]=arr[x];
					arr[x]=tem;
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
