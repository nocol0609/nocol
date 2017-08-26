package com.set_son_hashset;

import java.util.HashSet;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * HashSet:�洢�ַ���������
 * ���⣺Ϊʲô�洢�ַ�����ʱ���ַ���������ͬ��ֻ�洢��һ����?
 * ͨ���鿴add������Դ�룬����֪����������ײ����� ����������hashCode()��equals()��
 * ���裺
 * 		���ȱȽϹ�ϣֵ
 * 		�����ͬ�������ߣ��Ƚϵ�ֵַ������equals()
 * 		�����ͬ,��ֱ����ӵ�������	
 * ���շ����Ĳ�����˵��	
 * 		�ȿ�hashCode()ֵ�Ƿ���ͬ
 * 			��ͬ:������equals()����
 * 				����true��	˵��Ԫ���ظ����Ͳ����
 * 				����false��˵��Ԫ�ز��ظ�������ӵ�����
 * 			��ͬ����ֱ�Ӱ�Ԫ����ӵ�����
 * �����û����д������������Ĭ��ʹ�õ�Object()��һ����˵��ͬ��ͬ��
 * ��String����д��hashCode()��equals()���������ԣ����Ϳ��԰�������ͬ���ַ���ȥ����ֻ����һ����
 * 
 * ���ԣ�ʹ��HashSetȥ����Ҫ��дhashCoode()��equals()����
 * 
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// �������϶���
		HashSet<String> hs = new HashSet<String>();

		// ���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");

		// ��������
		for (String s : hs) {
			System.out.println(s);
		}
	}
}
