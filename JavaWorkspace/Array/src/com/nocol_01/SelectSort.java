package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��������֮ѡ������
 * 		��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
 */
public class SelectSort {
	public static void main(String[] args) {
		//����һ������
				int[] arr = { 24, 69, 80, 57, 13 };
				System.out.println("����ǰ��");
				printArray(arr);
		//����ѡ��������
				System.out.println("�����");
				selectSort(arr); 
				printArray(arr);
				/*
				// ��һ��
				int x = 0;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("��һ�αȽϺ�");
				printArray(arr);

				// �ڶ���
				x = 1;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("�ڶ��αȽϺ�");
				printArray(arr);

				// ������
				x = 2;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("�����αȽϺ�");
				printArray(arr);

				// ���Ĵ�
				x = 3;
				for (int y = x + 1; y < arr.length; y++) {
					if (arr[y] < arr[x]) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
				System.out.println("���ĴαȽϺ�");
				printArray(arr);
				*/
				
				/*
				//ͨ���۲췢�ִ�����ظ���̫�ߣ�������ѭ���Ľ�
				for(int x=0; x<arr.length-1; x++){
					for(int y=x+1; y<arr.length; y++){
						if(arr[y] <arr[x]){
							int temp = arr[x];
							arr[x] = arr[y];
							 arr[y] = temp;
						}
					}
				}
				System.out.println("�����");
				printArray(arr);
				*/
	}
	//ѡ��������
	public static void selectSort(int[] arr){
		//������ѭ������
		for(int x=0;x<arr.length-1;x++){
			//�ڲ���Ʊ���������int y=x+1����ʼ�Ƚϵ���������Ƚϴ������٣�
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<arr[x]){
					int tem=arr[y];
					arr[y]=arr[x];
					arr[x]=tem;
				}
			}
		}
	}
	//��������ǰ�������õ�����Ԫ�صĹ���
	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.print(arr[x]);
				System.out.println("]");
			}else{
				System.out.print(arr[x]+", ");
			}
		}
	}
}
