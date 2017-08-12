package com.nocol.stack;

/**
 * 自定义栈实现栈的基本功能
 * 
 * @author Nocol 下午3:52:24
 */
public class MyStack {

	// 底层是一个数组
	private long[] arr;
	// 栈顶
	private int top;

	/***
	 * 默认构造方法
	 */
	public MyStack() {
		arr = new long[10];
		top = -1; // 开始栈顶是没有元素的
	}

	/**
	 * 带参构造，参数为数组初始化大小
	 */
	public MyStack(int maxsize) {
		arr = new long[maxsize];
		top = -1;
	}

	/**
	 * 入栈
	 */
	public void push(int value) {

		// top先自增
		arr[++top] = value;   //即开始arr[0]为第一个入栈的数
	}
	
	/**
	 * 出栈 (移除数据)
	 */
	public long pop(){
		
		//移除后再自减
		return arr[top--];
	}
	
	/**
	 * 查看数据
	 */
	public long peek(){
		
		//返回栈顶数据
		return arr[top];
	}
	
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	
	/**
	 * 判断是否已满
	 */
	public boolean isFull(){
		return top==arr.length-1;
	}
	

}
