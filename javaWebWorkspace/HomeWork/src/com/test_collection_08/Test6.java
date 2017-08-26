package com.test_collection_08;

/*
 * 写一个接口: 
public interface SortArray{
	//可以把数组进行排序 然后把排好顺序的数组返回	
	int[] sort(int[] a);	

}

使用这个接口创建匿名内部类对象，来完成冒泡排序的功能
 */

interface SortArray{
	//可以把数组进行排序 然后把排好顺序的数组返回	
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
