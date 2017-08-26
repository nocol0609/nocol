package com.nocol.link.singlelink;

/**
 * �Զ��嵥������ --------LinkList
 * 
 * @author Nocol ����10:44:03
 */
public class MyLinkList {
	// ͷ�ڵ�
	private Node first;

	public MyLinkList() {
		first = null;
	}

	/**
	 * ����һ���ڵ㣬��ͷ���ǰ����
	 */
	public void addFirst(long value) {
		// ����Ҫ����Ľڵ�
		Node node = new Node(value);
		// ʹ����Ľڵ��ָ����ָ��ͷ�ڵ�
		node.next = first;
		// ��ʱͷ�ڵ����˸ղ���Ľڵ�
		first = node;
	}

	/**
	 * ɾ��ͷ�ڵ�
	 */
	public Node removeFirst() {
		// ��ȡͷ�ڵ�
		Node temp = first;
		// ʹ��ʼͷ�ڵ����һ�ڵ���ͷ�ڵ�
		first = temp.next;
		// ����ɾ����ͷ�ڵ�
		return temp;
	}

	/**
	 * ��ʾ����
	 */
	public void display() {
		// ��ȡ��ǰ�ڵ�
		Node current = first;
		while (current != null) {

			// �ݹ���ʾͷ�ڵ�
			current.display();
			current = current.next;
		}

		System.out.println();
	}

	/**
	 * ���Ҳ����ط���
	 */
	public Node get(long value) {
		// ��ȡ��ǰ�ڵ�
		Node current = first;
		while (current.data != value) { //
			if (current.next == null) {
				return null; // ����ǰ�ڵ��ָ����Ϊ��˵�������һ���ڵ㣬δ�ҵ����ؿ�
			}
			current = current.next; // ���ϸ���ͷ�ڵ�
		}
		return current;
	}

	/**
	 * ɾ������������������������ɾ��
	 */
	public Node delete(long value) {

		// ��ȡ��ǰ�ڵ�
		Node current = first;
		// ��ǰ�ڵ����һ���ڵ�
		Node previous = first;

		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}

		if (current == first) {
			//��Ҫɾ���Ľڵ���ͷ�ڵ���ֱ��ɾ��
			first = first.next;      
		} else {
			//������ͷ�ڵ���Ҫɾ���Ľڵ����һ���ڵ��ָ��ָ��ǰ�ڵ����һ���ڵ�
			previous.next = current.next;   
		}

		return current;
	}
}
