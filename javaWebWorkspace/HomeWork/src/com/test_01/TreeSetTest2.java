package com.test_01;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 
 * ʹ��TreeSet��Comparator��дTreeSetTest2
 * 
 * Ҫ�󣺶�TreeSet�е�Ԫ��1��2��3��4��5��6��7��8��9��10�������У� �����߼�Ϊ������ǰż���ں����������������У�ż�����ս�������
 */
public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {
			int r = 0;

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				// if (i2 % 2 == 0) {
				// return i2 - i1;//�����Ϊ��������i2��i1����λ�ã� ��Ϊ�������򲻽���
				// }
				// return i1 - i2;//
				if (i1 % 2 != i2 % 2) {
					r = (i2 % 2 - i1 % 2);
				} else if (i1 % 2 != 1) {
					if (i1 > i2)
						r = -1;
					else if (i1 < i2)
						r = 1;
				} else if (i1 % 2 != 0) {
					if (i1 > i2)
						r = 1;
					else if (i1 < i2)
						r = -1;
				} 
				return r;
			}
		});
		// ����Ԫ��
		for (int i = 1; i <= 10; i++) {
			ts.add(i);
		}
		// ����
		for (Integer ig : ts) {
			System.out.println(ig);
		}
	}
}