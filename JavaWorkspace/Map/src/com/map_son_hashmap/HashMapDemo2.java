package com.map_son_hashmap;

import java.util.HashMap;
import java.util.Set;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * HashMap<Integer,String>
 * ����Integer
 * ֵ��String
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// �������϶���
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// ����Ԫ�ز����Ԫ��
		// Integer i = new Integer(27);
		// Integer i = 27;
		// String s = "java";
		// hm.put(i, s);

		hm.put(27, "java");
		hm.put(30, "jsp");
		hm.put(28, "js");
		hm.put(29, "xml");

		// �����д���ǰ˽��ƣ����ǲ��ܳ���8���ϵĵ�������
		// hm.put(003, "hello");
		// hm.put(006, "hello");
		// hm.put(007, "hello");
		// hm.put(008, "hello");//����

		// ����
		Set<Integer> set = hm.keySet();//
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		// �������ַ�ʽ�����Ǽ��ϵ�Ԫ�ص��ַ�����ʾ
		// System.out.println("hm:" + hm);
	}
}

