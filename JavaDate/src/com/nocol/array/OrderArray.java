package com.nocol.array;

import java.util.Arrays;

/**
 * 自定义封住有序数组----------------有序 (ArrayList)+二分查找
 * 
 * @author Nocol 下午2:00:59
 */
public class OrderArray {

	// 自定义数组
	private long[] arr;
	// 有效数据的长度
	private int elements;

	public OrderArray() {
		arr = new long[50];
	}

	public OrderArray(int maxsize) {   //用于给定数组长度
		arr = new long[maxsize];
	}

	/**
	 * 有序添加数据
	 */
	public void insert(long value) {
		
		//判断容量
		ensureCapacity();
		
		int i;
		for (i = 0; i < elements; i++) {
			if (arr[i] > value) { // 插入时若存在比要插入的数据大时,停止搜所
				break;
			}
		}
		// 将该位置以后的数据全部后移（从最后的元素开始移）
		for (int j = elements; j > i; j--) {
			arr[j] = arr[j - 1];
		}
		// 将数据插入空出的位置
		arr[i] = value;
		elements++;
	}

	/**
	 * 显示数据
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * 二分法查找数据返回索引 -------前提是该数组必须是有序的
	 */
	public int binarySearch(long value) {
		int mid = 0;
		int low = 0;
		int pow = elements;   

		while (true) {
			
			mid = (low + pow) / 2; // 计算中间值的索引
			
			if (arr[mid] == value) {   //若查找的值正好与中间值相等则直接返回
				return mid;
			} else if (low > pow) {
				return -1;
			}else {
				//查找的值与中间值比较
				if(arr[mid]>value){   //往左边找
					pow=mid-1;
				}else {
					low=mid+1;        //往右边找
				}
			}
		}
	}
	
	/**
	 * 扩容
	 */
	public  void ensureCapacity(){
		if(arr.length==elements){
			arr=Arrays.copyOf(arr, 2*elements+1);
		}
	}
}
