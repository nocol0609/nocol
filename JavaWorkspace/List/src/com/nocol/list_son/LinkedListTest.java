package com.nocol.list_son;

import java.util.LinkedList;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 *����LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
 *��Ŀ����˼�ǣ�
 *		���Լ��Ķ���һ�������࣬������������ڲ�����ʹ��LinkedListģ�⡣//��������LinkedList��ʵ���Լ�����ļ�����
 *
 *      ע�⣺��������LinkedListֱ���ã�������LinkedLList������ӹ��ܣ�ÿ�ζ���addFirst();��ӣ�
 *           ������Ȼ���������Ƚ���������ǲ�������ĿҪ����˼��
 */

//�Զ���ջ����
class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}

	public void add(Object obj) {
		link.addFirst(obj);
	}

	public Object get() {
		// return link.getFirst();//ÿ�λ�ȡ��һ�����Ǽ��ϱ����䣬����ÿ����ͬһ��ֵ
		return link.removeFirst();//ÿ�����ߵ�һ��ʱ�����Ϸ����ı䣬����ÿ���õ�ֵ�᲻ͬ
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
//Mystack����
public class LinkedListTest {
	public static void main(String[] args) {
		// �������϶���
		MyStack ms = new MyStack();

		// ���Ԫ��
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

