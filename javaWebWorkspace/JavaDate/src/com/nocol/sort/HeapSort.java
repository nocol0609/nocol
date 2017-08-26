package com.nocol.sort;

/**
 * ������
 * 
 * @author Nocol ����11:55:46
 */
public class HeapSort {
	public static void sort(int[] arr) {

		// ˳�򹹽���ʼ��
		for (int i = arr.length / 2; i >= 0; i--) { // ��Ҷ�ӽڵ��������Ϊarr.length/2
			// �����ѣ�ʹ��ʼ���γɴ󶥶�
			HeadAdjust(arr, i, arr.length-1);
		}

		// �����ɴ󶥶Ѻ󽻻���1�������1��
		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			// ��������������󶥶�
			HeadAdjust(arr, 0, i);
		}
	}

	private static void HeadAdjust(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub

		// ������ʱ�����洢���ڵ��ֵ
		int temp = arr[parent];

		// ��ȡ���ӽڵ���ţ���0��ʼ��
		int child = 2 * parent + 1;

		while (child < length) {

			// �������Һ����ұ����Ӵ���ѡȡ�Һ���
			if (child + 1 < length && arr[child + 1] > arr[child]) {
				child++;
			}
			
			//�����ڵ�Ⱥ��ӽڵ���򲻵������򽻻�
			if (arr[child] < temp) {
				break;
			} else {
				arr[parent] = arr[child];
			}

			// �Ժ��ӽڵ�Ϊ���ڵ������������
			parent = child;
			child = 2 * parent + 1;
		}
		arr[parent] = temp;
	}

}
