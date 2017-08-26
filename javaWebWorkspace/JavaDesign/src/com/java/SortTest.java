package com.java;

import java.util.Arrays;

/**
 * 
 * @author Nocol
 *
 */
public class SortTest {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 1, 7, 4, 3, 2 };
		System.out.println("排序前：" + Arrays.toString(arr));
		// BubbleSort(arr);
		// SelectSort(arr);
		// insertSort(arr);
		//quickSort(arr, 0, 6);
		//megeSort(arr,0,6);
		//shellSort(arr);
		heapSort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));

	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		//循环建立初始堆
		for(int i=arr.length/2;i>=0;i--){   //非叶子节点的最大序号为 arr.length/2，i即为有子节点的节点
			
			//刷选调整堆（使其成为大顶堆）
			heapAdjust(arr,i,arr.length-1);		
		}
		
		//调整成大顶堆后交换第1个元素和最后1个元素
		for(int i=arr.length-1;i>0;i--){
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			//交换之后继续调整成大顶堆（此时根节点序号为0,）
			heapAdjust(arr, 0, i);  
			
		}
		
	}

	private static void heapAdjust(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub
		
		//定义临时变量保存当前父节点
		int temp=arr[parent];
		//获取父节点的左孩子节点序号（从0开始）
		int child=2*parent+1;
		
		while(child<length){
			
			//如果有右孩子节点，并且右孩子节点的值大于左孩子节点的值，则选取右孩子
			if(child+1<length&&arr[child+1]>arr[child]){
				child++;
			}
			
			//若父节点大于所有孩子节点的值，则直接结束
			if(temp>=arr[child]){
				break;
			}else {
				//否则将孩子节点的值（已经是左右孩子节点的最大值）赋给父节点
				arr[parent]=arr[child];
			}
			
			//继续选取孩子节点的左孩子节点向下筛选
			parent=child;
			child=2*child+1;
		}
		 	arr[parent]=temp;
	}

	private static void shellSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int gag=arr.length/2;gag>0;gag/=2){  //增量gap，并逐步缩小增量
			for(int i=gag;i<arr.length;i++){     //从第gap元素开始对其所在组进行插入排序
				for(int j=i;(j-gag>=0)&&arr[j]<arr[j-gag];j-=gag){
					int temp=arr[j];
					arr[j]=arr[j-gag];
					arr[j-gag]=temp;
				}
			}
		}
	}

	private static void megeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		//终止条件：l>=r
		if(l<r){
			
			//二路归并，分为两路
			int mid=(l+r)/2;
			
			//递归过程:将分开的子串递归再分成子串
			megeSort(arr, l, mid);
			megeSort(arr, mid+1, r);
			
			//将分开的有序子串归并
			megeArray(arr,l,mid,r);
			
		}
	}

	private static void megeArray(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		//l为第一个有序区的第1个元素，mid为第一个有序区的最后一个元素
		//定义i指向第一个有序区的第1个元素
		int i=l;
		//定义j指向第二个有序区的第1个元素，r为第二个有序区的最后一个元素
		int j=mid+1;
		
		//定义一个零食数组暂存合并的有序序列
		int temp[]=new int[arr.length];
		
		//设置临时数组的指示标志k
		int k=0;
		
		//顺序选取两个有序区的最小元素相比较，存储到临时数组中
		while(i<=mid&&j<=r){
			//将选取的两个有序区的最小元素中更小的存入临时数组
			if(arr[i]<=arr[j]){
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		
		//比完之后，若第1个有序区仍有剩余，则直接全部复制到临时数组
		//因为第1有序区可能存在有些元素比第2有序区任意元素都大
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		
		//比完之后，若第2个有序区仍有剩余，则直接全部复制到临时数组
		//因为第2有序区可能存在有些元素比第1有序区任意元素都大
		while(j<=r){
			temp[k++]=arr[j++];
		}
		
		//将排好序的序列，重存回到arr数组的l和r区间内
		for(i=l,k=0;i<=r;i++,k++){
			arr[i]=temp[k];
		}
		
	}

	private static void quickSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) { // 如果左边索引小于右边，则排序还未完成
			int i = l;
			int j = r;
			int key = arr[l];

			while (i < j) {
				// 从右往左
				while (i < j && arr[j] >= key) {
					j--;
				}
				arr[i] = arr[j];

				// 从右往左
				while (i < j && arr[i] <= key) {
					i++;
				}
				arr[j] = arr[i];
			}
			// 最后挖的坑
			arr[i] = key;

			// 左子串
			quickSort(arr, l, i - 1);
			// 右子串
			quickSort(arr, i + 1, r);
		}
	}

	private static void insertSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) { // 默认arr[0]是有序，从索引1开始后面的元素都是无序
			for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	private static void SelectSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static void BubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
