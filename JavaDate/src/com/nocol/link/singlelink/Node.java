package com.nocol.link.singlelink;

/**
 * 链节点---类似火车车厢
 * 
 * @author Nocol 上午10:41:22
 */
public class Node {
	// 数据域
	public long data;
	// 指针域
	public Node next;

	public Node(long value) {
		this.data = value;
	}

	/**
	 * 显示方法
	 */
	public void display() {
		System.out.print(data + " ");
	}
}
