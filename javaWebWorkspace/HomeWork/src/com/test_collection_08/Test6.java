package com.test_collection_08;

/*
 * дһ���ӿ�: 
public interface SortArray{
	//���԰������������ Ȼ����ź�˳������鷵��	
	int[] sort(int[] a);	

}

ʹ������ӿڴ��������ڲ�����������ð������Ĺ���
 */

interface SortArray{
	//���԰������������ Ȼ����ź�˳������鷵��	
	int[] sort(int[] a);	
}

public class Test6 {
	public static void main(String[] args) {
		
		int[] arr={1,4,6,2,7,5};
		SortArray sortArray = new SortArray() {
			
			@Override
			public int[] sort(int[] a) {
				// TODO Auto-generated method stub
				for(int i=0;i<a.length-1;i++){
					for(int j=0;j<a.length-1-i;j++){
						if(a[j]>a[j+1]){
							int temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
				return a;
			}
		};
		
		int[] sort = sortArray.sort(arr);
		
		for (int i : sort) {
			System.out.println(i);
		}
		
	}
}
