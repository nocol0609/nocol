package com.nocol.sort;

/**
 * ϣ������
 * 
 * @author Nocol ����11:23:22
 */
public class ShellSort {
	public static void sort(int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {   //����gap��������С����
			for (int i = gap; i < arr.length; i++) {          //�ӵ�gapԪ�ؿ�ʼ������������в�������
				for (int j = i; (j - gap>=0)  && (arr[j] < arr[j - gap]); j-=gap) {
					int temp = arr[j];
					arr[j] = arr[j - gap];
					arr[j - gap] = temp;
				}
			}
		}
	}
}
