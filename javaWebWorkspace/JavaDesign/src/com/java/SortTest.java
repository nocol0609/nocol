package com.java;

import java.util.Arrays;

/**
 * 
 * @author Nocol
 *
 */
public class SortTest {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 1, 7, 4, 3, 2 };
		System.out.println("����ǰ��" + Arrays.toString(arr));
		// BubbleSort(arr);
		// SelectSort(arr);
		// insertSort(arr);
		//quickSort(arr, 0, 6);
		//megeSort(arr,0,6);
		//shellSort(arr);
		heapSort(arr);
		System.out.println("�����" + Arrays.toString(arr));

	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		//ѭ��������ʼ��
		for(int i=arr.length/2;i>=0;i--){   //��Ҷ�ӽڵ��������Ϊ arr.length/2��i��Ϊ���ӽڵ�Ľڵ�
			
			//ˢѡ�����ѣ�ʹ���Ϊ�󶥶ѣ�
			heapAdjust(arr,i,arr.length-1);		
		}
		
		//�����ɴ󶥶Ѻ󽻻���1��Ԫ�غ����1��Ԫ��
		for(int i=arr.length-1;i>0;i--){
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			//����֮����������ɴ󶥶ѣ���ʱ���ڵ����Ϊ0,��
			heapAdjust(arr, 0, i);  
			
		}
		
	}

	private static void heapAdjust(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub
		
		//������ʱ�������浱ǰ���ڵ�
		int temp=arr[parent];
		//��ȡ���ڵ�����ӽڵ���ţ���0��ʼ��
		int child=2*parent+1;
		
		while(child<length){
			
			//������Һ��ӽڵ㣬�����Һ��ӽڵ��ֵ�������ӽڵ��ֵ����ѡȡ�Һ���
			if(child+1<length&&arr[child+1]>arr[child]){
				child++;
			}
			
			//�����ڵ�������к��ӽڵ��ֵ����ֱ�ӽ���
			if(temp>=arr[child]){
				break;
			}else {
				//���򽫺��ӽڵ��ֵ���Ѿ������Һ��ӽڵ�����ֵ���������ڵ�
				arr[parent]=arr[child];
			}
			
			//����ѡȡ���ӽڵ�����ӽڵ�����ɸѡ
			parent=child;
			child=2*child+1;
		}
		 	arr[parent]=temp;
	}

	private static void shellSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int gag=arr.length/2;gag>0;gag/=2){  //����gap��������С����
			for(int i=gag;i<arr.length;i++){     //�ӵ�gapԪ�ؿ�ʼ������������в�������
				for(int j=i;(j-gag>=0)&&arr[j]<arr[j-gag];j-=gag){
					int temp=arr[j];
					arr[j]=arr[j-gag];
					arr[j-gag]=temp;
				}
			}
		}
	}

	private static void megeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		//��ֹ������l>=r
		if(l<r){
			
			//��·�鲢����Ϊ��·
			int mid=(l+r)/2;
			
			//�ݹ����:���ֿ����Ӵ��ݹ��ٷֳ��Ӵ�
			megeSort(arr, l, mid);
			megeSort(arr, mid+1, r);
			
			//���ֿ��������Ӵ��鲢
			megeArray(arr,l,mid,r);
			
		}
	}

	private static void megeArray(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		//lΪ��һ���������ĵ�1��Ԫ�أ�midΪ��һ�������������һ��Ԫ��
		//����iָ���һ���������ĵ�1��Ԫ��
		int i=l;
		//����jָ��ڶ����������ĵ�1��Ԫ�أ�rΪ�ڶ��������������һ��Ԫ��
		int j=mid+1;
		
		//����һ����ʳ�����ݴ�ϲ�����������
		int temp[]=new int[arr.length];
		
		//������ʱ�����ָʾ��־k
		int k=0;
		
		//˳��ѡȡ��������������СԪ����Ƚϣ��洢����ʱ������
		while(i<=mid&&j<=r){
			//��ѡȡ����������������СԪ���и�С�Ĵ�����ʱ����
			if(arr[i]<=arr[j]){
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		
		//����֮������1������������ʣ�࣬��ֱ��ȫ�����Ƶ���ʱ����
		//��Ϊ��1���������ܴ�����ЩԪ�رȵ�2����������Ԫ�ض���
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		
		//����֮������2������������ʣ�࣬��ֱ��ȫ�����Ƶ���ʱ����
		//��Ϊ��2���������ܴ�����ЩԪ�رȵ�1����������Ԫ�ض���
		while(j<=r){
			temp[k++]=arr[j++];
		}
		
		//���ź�������У��ش�ص�arr�����l��r������
		for(i=l,k=0;i<=r;i++,k++){
			arr[i]=temp[k];
		}
		
	}

	private static void quickSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) { // ����������С���ұߣ�������δ���
			int i = l;
			int j = r;
			int key = arr[l];

			while (i < j) {
				// ��������
				while (i < j && arr[j] >= key) {
					j--;
				}
				arr[i] = arr[j];

				// ��������
				while (i < j && arr[i] <= key) {
					i++;
				}
				arr[j] = arr[i];
			}
			// ����ڵĿ�
			arr[i] = key;

			// ���Ӵ�
			quickSort(arr, l, i - 1);
			// ���Ӵ�
			quickSort(arr, i + 1, r);
		}
	}

	private static void insertSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) { // Ĭ��arr[0]�����򣬴�����1��ʼ�����Ԫ�ض�������
			for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	private static void SelectSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static void BubbleSort(int[] arr) {
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