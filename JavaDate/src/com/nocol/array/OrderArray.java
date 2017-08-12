package com.nocol.array;

import java.util.Arrays;

/**
 * �Զ����ס��������----------------���� (ArrayList)+���ֲ���
 * 
 * @author Nocol ����2:00:59
 */
public class OrderArray {

	// �Զ�������
	private long[] arr;
	// ��Ч���ݵĳ���
	private int elements;

	public OrderArray() {
		arr = new long[50];
	}

	public OrderArray(int maxsize) {   //���ڸ������鳤��
		arr = new long[maxsize];
	}

	/**
	 * �����������
	 */
	public void insert(long value) {
		
		//�ж�����
		ensureCapacity();
		
		int i;
		for (i = 0; i < elements; i++) {
			if (arr[i] > value) { // ����ʱ�����ڱ�Ҫ��������ݴ�ʱ,ֹͣ����
				break;
			}
		}
		// ����λ���Ժ������ȫ�����ƣ�������Ԫ�ؿ�ʼ�ƣ�
		for (int j = elements; j > i; j--) {
			arr[j] = arr[j - 1];
		}
		// �����ݲ���ճ���λ��
		arr[i] = value;
		elements++;
	}

	/**
	 * ��ʾ����
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * ���ַ��������ݷ������� -------ǰ���Ǹ���������������
	 */
	public int binarySearch(long value) {
		int mid = 0;
		int low = 0;
		int pow = elements;   

		while (true) {
			
			mid = (low + pow) / 2; // �����м�ֵ������
			
			if (arr[mid] == value) {   //�����ҵ�ֵ�������м�ֵ�����ֱ�ӷ���
				return mid;
			} else if (low > pow) {
				return -1;
			}else {
				//���ҵ�ֵ���м�ֵ�Ƚ�
				if(arr[mid]>value){   //�������
					pow=mid-1;
				}else {
					low=mid+1;        //���ұ���
				}
			}
		}
	}
	
	/**
	 * ����
	 */
	public  void ensureCapacity(){
		if(arr.length==elements){
			arr=Arrays.copyOf(arr, 2*elements+1);
		}
	}
}
