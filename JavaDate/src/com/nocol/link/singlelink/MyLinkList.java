package com.nocol.link.singlelink;

/**
 * 自定义单向链表 --------LinkList
 * 
 * @author Nocol 上午10:44:03
 */
public class MyLinkList {
	// 头节点
	private Node first;

	public MyLinkList() {
		first = null;
	}

	/**
	 * 插入一个节点，在头结点前插入
	 */
	public void addFirst(long value) {
		// 创建要插入的节点
		Node node = new Node(value);
		// 使插入的节点的指针域指向头节点
		node.next = first;
		// 此时头节点变成了刚插入的节点
		first = node;
	}

	/**
	 * 删除头节点
	 */
	public Node removeFirst() {
		// 获取头节点
		Node temp = first;
		// 使开始头节点的下一节点变成头节点
		first = temp.next;
		// 返回删除的头节点
		return temp;
	}

	/**
	 * 显示方法
	 */
	public void display() {
		// 获取当前节点
		Node current = first;
		while (current != null) {

			// 递归显示头节点
			current.display();
			current = current.next;
		}

		System.out.println();
	}

	/**
	 * 查找并返回方法
	 */
	public Node get(long value) {
		// 获取当前节点
		Node current = first;
		while (current.data != value) { //
			if (current.next == null) {
				return null; // 若当前节点的指针域为空说明是最后一个节点，未找到返回空
			}
			current = current.next; // 不断赋予头节点
		}
		return current;
	}

	/**
	 * 删除方法，根据数据域来进行删除
	 */
	public Node delete(long value) {

		// 获取当前节点
		Node current = first;
		// 当前节点的上一个节点
		Node previous = first;

		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}

		if (current == first) {
			//若要删除的节点是头节点则直接删除
			first = first.next;      
		} else {
			//若不是头节点则将要删除的节点的上一个节点的指针指向当前节点的下一个节点
			previous.next = current.next;   
		}

		return current;
	}
}
