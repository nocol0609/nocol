package com.test_collection_07;

import java.util.ArrayList;

public class MyStack {
	
	/**
	 * 先进后出
	 */
	ArrayList<Integer> stack;

	public MyStack() {
		stack = new ArrayList<Integer>();
	}

	// 入栈
	public void push(Integer i) {
		stack.add(i);
	}

	// 出栈
	public int pop() {

		if (!stack.isEmpty()) {
			int temp = stack.get(stack.size() - 1);

			stack.remove(stack.size() - 1);

			return temp;
		} else {
			return -1;
		}
	}
}
