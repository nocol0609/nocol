package com.java.test;

public class SortTest {
	public static void main(String[] args) {

		int arr[] = { 2, 6, 9, 3, 6, 8 };
		System.out.println("����ǰ��");
		printArray(arr);
		System.out.println("ʹ��ð�������");
		BbbleSort(arr);
		printArray(arr);
		System.out.println("ʹ��ѡ�������");
		SelectSort(arr);
		printArray(arr);
	}
	//ѡ������
	private static void SelectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;					
				}
			}
		}
	}

	// ð������
	private static void BbbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){//ѭ������
			for(int j=0;j<arr.length-1-i;j++){//��������
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
	//��ӡ����
	private static void printArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {
				sb.append(arr[i] + ",");
			}
		}
		System.out.println(sb);
	}
}
