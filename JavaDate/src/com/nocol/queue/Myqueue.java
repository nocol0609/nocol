package com.nocol.queue;

/**
 * 自定义队列
 * 
 * @author Nocol 下午3:18:47
 */
public class Myqueue {
	private long[] arr; // 底层数组实现
	private int elements; // 有效数据的长度
	private int front; // 队头
	private int end; // 队尾

	/*
	 * 默认构造器
	 */
	public Myqueue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 带参构造器
	 */
	public Myqueue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 入队----从队尾入队
	 */
	public void insert(long value) {
		arr[++end] = value; // 即的哥元素为arr[0]=value
		elements++;
	}

	/**
	 * 出队----从队头出队
	 */
	public long remove() {
		elements--;
		return arr[front++];
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
