package com.nocol.array;

/**
 * 使用自定义类对数组进行封装，实现数据的增删改查  --------------无序数组
 * 
 * @author Nocol 下午1:14:35
 */
public class MyArray {

	// 自定义数组
	private long[] arr;
	// 数组有效数据的长度
	private int elements; // 初始为0

	public MyArray() {
		arr = new long[50]; // 初始化数组长度为50
	}

	public MyArray(int maxsize) {  //参数为数组初始化大小
		arr = new long[maxsize];
	}

	/**
	 * 添加数据
	 */
	public void insert(long value) {
		arr[elements] = value;
		elements++; // 添加数据后索引自增
	}

	/**
	 * 显示数据
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) { // 只显示有效数据
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * 查找数据：根据值查找返回该数的索引
	 */
	public int search(long value) {

		int i;
		for (i = 0; i < elements; i++) { // 在有效的数据中查找  -------线性查找
			if (value == arr[i]) {
				break;
			}
		}

		if (i == elements) {
			return -1;
		} else {
			return i;
		}
	}

	/**
	 * 查找数据：根据索引查找
	 */
	public long get(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}

	/**
	 * 删除数据
	 */
	public void delete(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = index; i < elements; i++) {
				arr[i] = arr[i + 1];
			}
			elements--; // 删除后有效数据长度自减
		}
	}

	/**
	 * 更新数据
	 */
	public void change(int index,long newValue) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index]=newValue;
		}
	}
}
