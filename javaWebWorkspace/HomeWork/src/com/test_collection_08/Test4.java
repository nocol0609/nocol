package com.test_collection_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ���Ϻ��������������Щ��
��1)�����Ǵ�С�̶��ģ�����ͬһ������ֻ�ܴ������һ�������ݣ���������/�������ͣ�
(2)JAVA���Ͽ��Դ洢�Ͳ�����Ŀ���̶���һ�����ݡ� 
(3)������ʱ��֪��������Ҫ���ٶ�����Ҫ�ڿռ䲻��ʱ�Զ���������������Ҫʹ��������⣬array�����á�

����˵�����Ϻ�����֮������໥ת��
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		//������ת���ɼ���
		List list = Arrays.asList(arr);
		//������ת��������
		List<Integer> list2=new ArrayList<>();
		list2.add(1);
		list2.add(2);
		Object[] array = list2.toArray();
	}
}
