package com.nocol.test1;

import java.util.ArrayList;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ȥ��ArrayList����ͬ��Ԫ��
 */
public class ArrayListTest {
	public static void main(String[] args) {
		// ��������
		ArrayList<String> array = new ArrayList<String>();
		// ��Ӽ���Ԫ��
		array.add("hello");
		array.add("java");
		array.add("java");
		array.add("hello");
		array.add("xml");
		array.add("android");
		// �����¼���
		ArrayList<String> newarray = new ArrayList<String>();

		// �����ϼ���
		for (String s : array) {
			if (!newarray.contains(s)) {
				newarray.add(s);
			}
		}
		// �����¼���
		for (String s : newarray) {
			System.out.println(s);  //hello��java��xml��android
		}
		System.out.println(array);
	}
}
