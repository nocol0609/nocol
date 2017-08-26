package com.test_collection_07;

import java.util.ArrayList;

public class MyQueue {

	ArrayList<Integer> queue;

	public MyQueue() {
		queue = new ArrayList<Integer>();
	}

	// 入队
	public void in(Integer i) {
		if (i != null) {
			queue.add(0, i);
		}
	}

	// 出队
	public int out() {
		if (!queue.isEmpty()) {
			// int temp = queue.get(queue.size() - 1);
			int temp = queue.get(0);
			// queue.remove(queue.size() - 1);
			queue.remove(0);
			return temp;
		} else {
			return -1;
		}
	}
}
