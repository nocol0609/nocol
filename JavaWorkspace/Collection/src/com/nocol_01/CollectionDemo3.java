package com.nocol_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�
 * 
 * Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// ��������
		Collection c = new ArrayList();
		// ���Ԫ��
		c.add("hello");// Object obj = "hello"; ����ת��
		c.add("world");
		c.add("java");
		// System.out.println(c);
		// ������ת��Ϊ����
		Object[] obj = c.toArray();
		// ��������Ԫ�أ�����������Ԫ��
		for (int x = 0; x < obj.length; x++) {
			// System.out.println(obj[x]);
			// Ԫ�����ַ������ڻ�ȡ��Ԫ�صĵ�ͬʱ���õ�Ԫ�صĳ��ȡ�
			// System.out.println(objs[x] + "---" + objs[x].length());
			// �����ʵ�ֲ��ˣ�ԭ����Object��û��length()����
			// ����Ҫ��ʹ���ַ����ķ������ͱ����Ԫ�ػ�ԭ���ַ��� 
			String str = (String) obj[x];//��ԭ�ַ��� // ����ת��
			System.out.println(str + "-----" + str.length());
		}
	}
}
