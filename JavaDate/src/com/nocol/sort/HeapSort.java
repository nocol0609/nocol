package com.nocol.sort;

/**
 * 堆排序
 * 
 * @author Nocol 上午11:55:46
 */
public class HeapSort {
	public static void sort(int[] arr) {

		// 顺序构建初始堆
		for (int i = arr.length / 2; i >= 0; i--) { // 非叶子节点的序号最大为arr.length/2
			// 调整堆，使初始堆形成大顶堆
			HeadAdjust(arr, i, arr.length-1);
		}

		// 调整成大顶堆后交换第1个和最后1个
		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			// 交换后继续调整大顶堆
			HeadAdjust(arr, 0, i);
		}
	}

	private static void HeadAdjust(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub

		// 定义临时变量存储父节点的值
		int temp = arr[parent];

		// 获取左孩子节点序号（从0开始）
		int child = 2 * parent + 1;

		while (child < length) {

			// 若存在右孩子且比左孩子大，则选取右孩子
			if (child + 1 < length && arr[child + 1] > arr[child]) {
				child++;
			}
			
			//若父节点比孩子节点大则不调整否则交换
			if (arr[child] < temp) {
				break;
			} else {
				arr[parent] = arr[child];
			}

			// 以孩子节点为父节点继续向下搜素
			parent = child;
			child = 2 * parent + 1;
		}
		arr[parent] = temp;
	}

}
