package com.nocol.link.singlelink;

/**
 * ���ڵ�---���ƻ𳵳���
 * 
 * @author Nocol ����10:41:22
 */
public class Node {
	// ������
	public long data;
	// ָ����
	public Node next;

	public Node(long value) {
		this.data = value;
	}

	/**
	 * ��ʾ����
	 */
	public void display() {
		System.out.print(data + " ");
	}
}
