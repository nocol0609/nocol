package com.nocol.link.doublelink;

/**
 * ˫������Ľڵ���
 * 
 * @author Nocol ����2:38:52
 */
public class Node {
	// ������
	public long data;
	// ָ����
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
	 * ��ʾ����
	 */
	public void display() {
		System.out.print(data + " ");
	}

}
