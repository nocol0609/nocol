package com.test_array_06;

/*
 * ʹ�����飬������Ԫ���б���1��10��Ȼ����������Ԫ����˲���������
 */
public class test1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int result = Sum(arr);
		System.out.println("��������Ԫ����˽���ǣ�" + result);

	}

	private static int Sum(int[] arr) {
		// TODO Auto-generated method stub
		int j = 1;

		for (int i = 0; i < arr.length; i++) {
			j *= arr[i];
		}
		return j;
	}
}
