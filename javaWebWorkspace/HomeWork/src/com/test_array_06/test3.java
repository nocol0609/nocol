package com.test_array_06;

/*
 * ����1����������int���͵�����array1��array2��ʹ��{}��array1��ʼ��Ϊ8��������2��3��5��7��11��13��17��19��
 * ��ʾarray1�����ݡ�
 * ����2����ֵarray2=array1���޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ����ʾarray1�е����ݣ�������ʲô�仯��
 */
public class test3 {
	public static void main(String[] args) {

		int[] array1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };
		// ��ӡarray1
		System.out.println("��ӡarray1��");
		printArry(array1);
		
		//��array1����arrray2
		int[] array2=new int[]{};
		array2=array1;
		array2[0]=0;
		array2[2]=2;
		array2[4]=4;
		array2[6]=6;
		
		//��ӡarray2
		System.out.println("��ӡarray1��");
		printArry(array1);
		System.out.println("��ӡarray2��");
		printArry(array2);
	}

	private static void printArry(int[] arr) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {
				sb.append(arr[i] + ", ");
			}
		}
		System.out.println(sb);
	}
}
