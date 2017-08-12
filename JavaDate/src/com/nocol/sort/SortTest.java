package com.nocol.sort;

import java.util.Arrays;

/**
 * ≈≈–Ú≤‚ ‘
 * @author Nocol
	…œŒÁ11:13:51
 */
public class SortTest {
	public static void main(String[] args) {
		int[] arr={3,7,6,4,1,5,2};
		System.out.println("≈≈–Ú«∞£∫"+Arrays.toString(arr));
		//BubbleSort.sort(arr);
		//SelectSort.sort(arr);
		//InsertSort.sort(arr);
		//ShellSort.sort(arr);
		//QuickSort.sort(arr, 0, 6);
		//MegeSort.sort(arr, 0, 6);
		HeapSort.sort(arr);
		System.out.println("≈≈–Ú∫Û£∫"+Arrays.toString(arr));
	}
}
