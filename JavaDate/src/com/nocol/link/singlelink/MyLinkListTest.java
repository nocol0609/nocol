package com.nocol.link.singlelink;

/**
 * 测试自定义LinkList
 * 
 * @author Nocol 上午11:09:38
 */
public class MyLinkListTest {
	public static void main(String[] args) {
		MyLinkList linkList = new MyLinkList();
		linkList.addFirst(3);
		linkList.addFirst(8);
		linkList.addFirst(1);
		linkList.addFirst(6);
		linkList.addFirst(2);

		linkList.display();

		linkList.delete(1);
		linkList.display();
		
		linkList.removeFirst();
		linkList.display();

		Node node = linkList.get(6);
		node.display();

	}
}
