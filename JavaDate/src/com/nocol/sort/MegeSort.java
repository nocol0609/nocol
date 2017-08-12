package com.nocol.sort;

/**
 * �鲢����
 * 
 * @author Nocol ����11:40:01
 */
public class MegeSort {
	public static void sort(int[] arr, int l, int r) {
		//��ֹ������l>=r
		if (l < r) {
			int mid = (l + r) / 2;

			// �ݹ齫�����зֳ���·
			sort(arr, l, mid);
			sort(arr, mid + 1, r);

			// ���ź�����Ӵ��鲢��һ����������
			MegeArray(arr, l, mid, r);
		}
	}

	private static void MegeArray(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int i = l;
		int j = mid + 1;
		int[] temp = new int[arr.length];
		int k = 0;
		
		//˳��ѡȡ��������������С��Ԫ�����Ƚϣ���С�Ĵ���ʱ����
		while (i <= mid && j <= r) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		//��1�����д���ĳ(��)��Ԫ�رȵ�2������Ԫ�ض���
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		
		//��2�����д���ĳ(��)��Ԫ�رȵ�1������Ԫ�ض���
		while (j <= r) {
			temp[k++] = arr[j++];
		}
		
		//����ʱ�������ź����Ԫ��ת�浽l��r����
		for (i = l, k = 0; i <= r; i++, k++) {
			arr[i] = temp[k];
		}

	}
}
