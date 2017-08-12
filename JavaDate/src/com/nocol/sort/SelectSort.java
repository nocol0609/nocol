package com.nocol.sort;

/**
 * —°‘Ò≈≈–Ú
 * 
 * @author Nocol …œŒÁ11:17:08
 */
public class SelectSort {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
