package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���ң�
 * 		��������:����Ԫ������(��ͷ�ҵ�β)
 * 		���ֲ���(�۰����):����Ԫ������
 * 
 * ������
 * 		A:���������������С����
 * 		B:������м�����
 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
 * 			��ȣ��ͷ��ص�ǰ���м�����
 * 			����ȣ�
 * 				��	�����
 * 				С	�ұ���
 * 		D:���¼�����м�����
 * 			��	�����
 * 				max = mid - 1;
 * 			С	�ұ���
 * 				min = mid + 1;
 * 		E:�ص�B
 */
public class ArraySearch {
	public static void main(String[] args) {
		int[] arr={11,22,33,44,55,66,77};
		//���󣺲������ֵ������
		//�����ַ�����ʵ��
		int result=getIndex(arr, 77);
		System.out.println("���ֵ�������ǣ�"+result );
		
		//����Ԫ�ز�����
		int result2=getIndex(arr, 777);
		System.out.println("���ֵ�������ǣ�"+result2 );//-1
	}
	/*
	 * ������ȷ��
	 * ����ֵ���ͣ�int
	 * �����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value){
		//���������������С����
		int min=0;
		int max=arr.length-1;
		//������м�����
		int mid=(min+max)/2;
		//���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while(arr[mid]!=value){
			if(arr[mid]>value){
				max=mid-1;
			}else if(arr[mid]<value){
				min=mid+1;
			}
			//�����ж�
			if(min>max){
				return -1;
			}
			//���¼�����м�����
			mid = (max +min)/2;
		}
		return mid;
	}
}
