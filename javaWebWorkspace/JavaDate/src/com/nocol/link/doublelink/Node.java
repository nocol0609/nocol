package com.nocol.link.doublelink;

/**
 * 双向链表的节点类
 * 
 * @author Nocol 下午2:38:52
 */
public class Node {
	// 数据域
	public long data;
	// 指针域
	public  Node next;
	public  Node previous;

	public Node(long value) {
		this.data = value;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	/**
	 * 显示方法
	 */
	public void display() {
		System.out.print(data + " ");
	}

}
