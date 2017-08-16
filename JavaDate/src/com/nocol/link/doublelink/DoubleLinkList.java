package com.nocol.link.doublelink;

/**
 * �Զ���˫������
 * 
 * @author Nocol ����2:45:01
 */
public class DoubleLinkList {
	// ͷ�ڵ�
	private Node first;
	// β�ڵ�
	private Node last;

	public DoubleLinkList() {

		first = null;
		last = null;
	}

	/**
	 * ��ͷ�ڵ����
	 */
	public void addFirst(long value) {
		// ����Ҫ����Ľڵ�
		Node node = new Node(value);

		// �ж�ͷ�ڵ��Ƿ�Ϊ��
		if (first == null) {
			last = node;
		} else {
			first.previous = node;
		}

		node.next = first;
		first = node;
	}

	/**
	 * ��β�ڵ����
	 */
	public void addLast(long value) {
		Node node = new Node(value);
		if (first == null) {
			first = node;
		} else {
			last.next = node;
			node.previous = last;
		}
		last = node;
	}

	/**
	 * ɾ��ͷ�ڵ�
	 */
	public Node removeFirst() {
		// ��ȡͷ�ڵ�
		Node tmp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = tmp.next;
		return tmp;
	}

	/**
	 * ɾ��β�ڵ�
	 */
	public Node removeLast() {
		// ��ȡβ�ڵ�
		Node tmp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}

		last = tmp.previous;
		return tmp;
	}

	/**
	 * ��ʾ����
	 */
	public void dispaly() {
		// ��ȡ��ǰ�ڵ�
		Node current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * ���ҷ���
	 */
	public Node get(long value) {
		Node current = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * ɾ������
	 */
	public Node remove(long value) {
		Node current = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}

		if (current == first) {
			first = first.next;
		} else {
			current.previous.next = current.next;
		}

		return current;
	}
}