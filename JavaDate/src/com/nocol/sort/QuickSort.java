package com.nocol.sort;

/**
 * ��������
 * 
 * @author Nocol ����11:33:57
 */
public class QuickSort {
	public static void sort(int[] arr, int l, int r) {
		if (l < r) {  // ����������С���ұߣ�������δ���

			int i = l;
			int j = r;
			int key = arr[l];

			while (i < j) {

				while (i < j && arr[j] >= key) {
					j--;
				}
				arr[i] = arr[j];

				while (i < j && arr[i] <= key) {
					i++;
				}
				arr[j] = arr[i];
			}
			arr[i] = key;

			sort(arr, l, i - 1);   //��������
			sort(arr, i + 1, r);   //��������

		}
	}
}
