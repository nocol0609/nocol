package com.nocol.list_son;

import java.util.LinkedList;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 *请用LinkedList模拟栈数据结构的集合，并测试
 *题目的意思是：
 *		你自己的定义一个集合类，在这个集合类内部可以使用LinkedList模拟。//可以利用LinkedList来实现自己定义的集合类
 *
 *      注意：并不是拿LinkedList直接用，即利用LinkedLList特有添加功能，每次都用addFirst();添加，
 *           这样虽然可以做到先进后出，但是并不是题目要的意思。
 */

//自定义栈集合
class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}

	public void add(Object obj) {
		link.addFirst(obj);
	}

	public Object get() {
		// return link.getFirst();//每次获取第一个但是集合本身不变，所以每次拿同一个值
		return link.removeFirst();//每次拿走第一个时，集合发生改变，所以每次拿的值会不同
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
//Mystack测试
public class LinkedListTest {
	public static void main(String[] args) {
		// 创建集合对象
		MyStack ms = new MyStack();

		// 添加元素
		ms.add("hello");
		ms.add("world");
		ms.add("java");

		// System.out.println(ms.get());
		// System.out.println(ms.get());
		// System.out.println(ms.get());
		// NoSuchElementException
		// System.out.println(ms.get());
		
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
	}
}

