package com.nocol.link.doublelink;

/**
 * 测试自定义双向链表
 * 
 * @author Nocol 下午4:19:00
 */
public class DoubleLinkListTest {
	public static void main(String[] args) {
		
		DoubleLinkList doubleLinkList=new DoubleLinkList();
		
		doubleLinkList.addFirst(4);
		doubleLinkList.addFirst(1);
		doubleLinkList.addFirst(7);
		doubleLinkList.addFirst(3);
		doubleLinkList.addFirst(9);
		doubleLinkList.addFirst(5);
		
		doubleLinkList.dispaly();
		
		doubleLinkList.removeFirst();
		doubleLinkList.dispaly();
		
		doubleLinkList.removeLast();
		doubleLinkList.dispaly();
		
		doubleLinkList.addLast(5);
		doubleLinkList.dispaly();
	}
}
