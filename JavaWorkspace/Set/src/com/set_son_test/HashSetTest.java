package com.set_son_test;

import java.util.HashSet;
import java.util.Random;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A:�������������
 * 		B:����һ��HashSet����             //��ȥ�أ�Ψһ�ԣ�
 * 		C:�жϼ��ϵĳ����ǲ���С��10
 * 			�ǣ��ʹ���һ����������
 * 			�񣺲�������
 * 		D:����HashSet����
 */
public class HashSetTest {
	public static void main(String[] args) {
		//�������������
		Random r=new Random();
		//����HashSet����
		HashSet<Integer> hs=new HashSet<Integer>();
		//�жϼ��ϳ����Ƿ�С��10
		while(hs.size()<10){  //�����ϳ���С��10�����������������жϵĻ�������10����������ܻ����ظ�
			int num=r.nextInt(20)+1;//0��20 
			hs.add(num); 
		}
		//��������
		for(Integer i:hs){
			System.out.println(i);
		}
	}
}
