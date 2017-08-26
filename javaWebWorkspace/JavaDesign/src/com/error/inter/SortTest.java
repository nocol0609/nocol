package com.error.inter;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 7, 2, 4, 5 };
		System.out.println(Arrays.toString(arr));
		// bubbleSort(arr);
		// selectSort(arr);
		// insertSort(arr);
		// shellSort(arr);
		// quickSort(arr,0,6);
		//megeSort(arr, 0, 6);
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=arr.length/2;i>=0;i--){
			
			headAdjust(arr,i,arr.length);
			
		}
		
		for(int i=arr.length-1;i>0;i--){
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			headAdjust(arr, 0, i);
		}
		
	}

	private static void headAdjust(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub
		int temp=arr[parent];
		int child=2*parent+1;  //����
		
		while(child<length){
			
			if(child+1<length&&arr[child+1]>arr[child]){
				child++;     //ȡ�Һ���
			}
			
			if(arr[child]<=temp){
				break;
			}else {
				arr[parent]=arr[child];
			}
			
			parent=child;
			child=2*parent+1;
		}
			arr[parent]=temp;
	}

	private static void megeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			int mid = (l + r) / 2;

			megeSort(arr, l, mid);
			megeSort(arr, mid + 1, r);

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
	}

	private static void quickSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
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

			quickSort(arr, l, i - 1);
			quickSort(arr, i + 1, r);

		}
	}

	private static void shellSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i; (j - gap >= 0) && (arr[j] < arr[j - gap]); j -= gap) {
					int temp = arr[j];
					arr[j] = arr[j - gap];
					arr[j - gap] = temp;
				}
			}
		}
	}

	private static void insertSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	private static void selectSort(int[] arr) {
		// TODO Auto-generated method stub
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

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
