package com.nocol_04;

import java.util.Arrays;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
 * 1:public static String toString(int[] a) ������ת���ַ���
 * 2:public static void sort(int[] a) �������������,�ײ��ǿ�������
 * 3:public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArrayTools {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) ������ת���ַ���
		String result=Arrays.toString(arr);//����ǰ���ֶ�ƴ��
		System.out.println("����ǰ��" + result);

		// public static void sort(int[] a) �������������
		Arrays.sort(arr); //�ײ������������Ԫ����������
		System.out.println("�����" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) ���ֲ���
		int result2=Arrays.binarySearch(arr, 57); 
		System.out.println("binarySearch:" +result2); //2
		int result3=Arrays.binarySearch(arr, 577); 
		System.out.println("binarySearch:" + result3);
	}
}
