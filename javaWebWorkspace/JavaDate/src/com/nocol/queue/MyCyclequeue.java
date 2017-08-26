package com.nocol.queue;

/**
 * 自定义循环队列
 * 
 * @author Nocol 下午8:52:52
 */
public class MyCyclequeue {
	private long[] arr; // 底层数组实现
	private int elements; // 有效数据的长度
	private int front; // 队头
	private int end; // 队尾

	/*
	 * 默认构造器
	 */
	public MyCyclequeue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 带参构造器
	 */
	public MyCyclequeue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 入队----从队尾入队
	 */
	public void insert(long value) {
		
		if (end == arr.length - 1) {
			end = -1; // 当队尾等于数组长度减1,说明队列已满，将队尾重新指向-1，才可以继续插入
		}

		arr[++end] = value; // 即第一个元素为arr[0]=value
		elements++;
	}

	/**
	 * 出队----从队头出队
	 */
	public long remove() {

		// 获取要删除的数据
		long value = arr[front++];

		if (front == arr.length) {
			front = 0;    //若对头等于数组长度，
		}

		elements--;
		return value;
	}

	/**
	 * 查看元素-----从队头查看
	 */
	public long peek() {

		return arr[front];
	}

	/**
	 * 判断队是否为空
	 */
	public boolean isEmpty() {
		return elements == 0;
	}

	/**
	 * 判断队是否已满
	 */
	public boolean isFull() {
		return elements == arr.length;
	}

}
