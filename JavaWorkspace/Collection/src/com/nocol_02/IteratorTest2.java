package com.nocol_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���󣺴洢�ַ�����������
 * 
 * ������
 * 		A:�������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class IteratorTest2 {
	public static void main(String[] args) {
		//�������϶���
		Collection c=new ArrayList();
		//�������
		c.add("java");
		c.add("hello");
		c.add("world");
		//��������Ԫ��
		Iterator it=c.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}
