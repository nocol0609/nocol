package com.nocol.sort;

import java.util.Arrays;

public class sortttt {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 1, 5, 2, 6, 4 };
		System.out.println(Arrays.toString(arr));
		// Heap(arr);
		// Mege(arr, 0, 6);
		Quick(arr, 0, 6);
		System.out.println(Arrays.toString(arr));
	}

	private static void Quick(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			int i = l;
			int j = r;

			int key = arr[l];

			while (i < j && arr[j] >= key) {
				j--;
			}
			arr[i] = arr[j];

			while (i < j && arr[i] <= key) {
				i++;
			}
			arr[j] = arr[i];

			arr[i] = key;
			Quick(arr, l, i - 1);
			Quick(arr, i + 1, r);
		}
	}

	private static void Mege(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			int mid = (l + r) / 2;
			Mege(arr, l, mid);
			Mege(arr, mid + 1, r);

			MegeArr(arr, l, mid, r);
		}
	}

	private static void MegeArr(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int i = l;
		int j = mid + 1;
		int[] temp = new int[arr.length];
		int k = 0;

		while (i <= mid && j <= r) {

			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		while (j <= r) {
			temp[k++] = arr[j++];
		}

		for (i = l, k = 0; i <= r; i++, k++) {
			arr[i] = temp[k];
		}

	}

	private static void Heap(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = arr.length / 2; i >= 0; i--) {
			adjustheap(arr, i, arr.length);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			adjustheap(arr, 0, i);
		}
	}

	private static void adjustheap(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub
		int temp = arr[parent];
		int child = 2 * parent + 1;

		while (child < length) {

			if (child + 1 < length && arr[child] < arr[child + 1]) {
				child++;
			}

			if (arr[child] < temp) {
				break;
			} else {
				arr[parent] = arr[child];
			}
			parent = child;
			child = 2 * parent + 1;
		}
		arr[parent] = temp;
	}
}
