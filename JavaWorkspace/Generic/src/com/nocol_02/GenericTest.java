package com.nocol_02;

import java.util.ArrayList;
import java.util.Iterator;



/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��������Щ�ط�ʹ����?
 * 		��API������࣬�ӿڣ���������������<E>��˵Ҫʹ�÷��͡�һ����˵�����ڼ�����ʹ�á�
 */
public class GenericTest {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array=new ArrayList<String>();
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		//��������
		//��ʽһ
		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		System.out.println("---------------");
		//��ʽ��
		for(int x=0;x<array.size();x++){
			String s2=array.get(x);
			System.out.println(s2);
		}
	}
}
