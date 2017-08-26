package com.test_01;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ʹ��TreeSet��Comparator,дTreeSetTest1
 * Ҫ�󣺶�TreeSet�е�Ԫ��"HashSet"��"ArrayList"��"TreeMap"��"HashMap"��"TreeSet"��
 * "LinkedList"��������͵�������
 * 
 */
public class TreeSetTest1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
			//����
			@Override
			public int compare(String s1, String s2) {
				//����λ�� ���� -1����λ�÷��� 1
				if (s1.compareTo(s2) > 0) {
					return 1;//������ֵ�˳��� String ����λ�ڲ����ַ���֮����ȽϽ��Ϊһ��������
				} else if (s1.compareTo(s2) < 0) {
					return -1;//������ֵ�˳��� String ����λ�ڲ����ַ���֮ǰ����ȽϽ��Ϊһ��������
				} else {
					return 0;
				}
			}
		});
		ts.add("HashSet");
		ts.add("ArrayList");
		ts.add("TreeMap");
		ts.add("HashMap");
		ts.add("TreeSet");
		ts.add("LinkedList");

		for (String s : ts) {
			System.out.println(s);
		}

	}
}