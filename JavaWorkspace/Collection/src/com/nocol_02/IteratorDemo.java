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
 * Iterator iterator():�����������ϵ�ר�ñ�����ʽ��Iterator�ӿ����������������󷽷�
 * 		Object next():��ȡԪ��,���ƶ�����һ��λ�á�
 *      boolean hasNext():�������Ԫ�ؿ��Ե������򷵻� true��
 *      
 * 		NoSuchElementException��û��������Ԫ�أ���Ϊ���Ѿ��ҵ�����ˡ�
 * 		   
 */
public class IteratorDemo {
	public static void main(String[] args) { 
		//�������϶���
		Collection c=new ArrayList();
		//���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		//�ü���ר�õı�����ʽ��������
		//Iterator iterator():�����������ϵ�ר�ñ�����ʽ
		Iterator it=c.iterator();//Iterrator��һ���ӿڣ��ӿ�������ֵʵ�ʷ���ʵ�������
		
		//Object next():��ȡԪ��,���ƶ�����һ��λ�á�
 //		Object obj=it.next();
//		System.out.println(obj);
		
		while(it.hasNext()){  //�ж��Ƿ�����Ԫ��
			//System.out.println(it.next());//��ʱ����Object����
			//���Ҫת����String���ͣ�����ת��
			String str=(String)it.next();
			System.out.println(str);//��ʱ����Ԫ��Ϊ�ַ�������
		} 
	}
}
