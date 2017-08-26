package com.nocol.sort;

/**
 * 归并排序
 * 
 * @author Nocol 上午11:40:01
 */
public class MegeSort {
	public static void sort(int[] arr, int l, int r) {
		//终止条件：l>=r
		if (l < r) {
			int mid = (l + r) / 2;

			// 递归将子序列分成两路
			sort(arr, l, mid);
			sort(arr, mid + 1, r);

			// 将排好序的子串归并成一个有序序列
			MegeArray(arr, l, mid, r);
		}
	}

	private static void MegeArray(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int i = l;
		int j = mid + 1;
		int[] temp = new int[arr.length];
		int k = 0;
		
		//顺序选取两个子序列中最小的元素作比较，更小的存临时数组
		while (i <= mid && j <= r) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		//第1个序列存在某(几)个元素比第2中任意元素都大
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		
		//第2个序列存在某(几)个元素比第1中任意元素都大
		while (j <= r) {
			temp[k++] = arr[j++];
		}
		
		//将临时数组中排好序的元素转存到l与r区间
		for (i = l, k = 0; i <= r; i++, k++) {
			arr[i] = temp[k];
		}

	}
}
