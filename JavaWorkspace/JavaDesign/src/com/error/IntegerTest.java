package com.error;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ������д���
 * 
 * ע�⣺Integer������ֱ�Ӹ�ֵ�������-128��127֮�䣬��ֱ�Ӵӻ�������ȡ����
 */
public class IntegerTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true
		System.out.println("-----------");

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);//false
		System.out.println(i3.equals(i4));//true
		System.out.println("-----------");

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false  ������127�ø��Կ��ռ�
		System.out.println(i5.equals(i6));//true
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);//true  ��-128��127��Χ�ڣ�ֱ���ڻ�����ã����ÿ��ռ�
		System.out.println(i7.equals(i8));//true

		// ͨ���鿴Դ�룬���Ǿ�֪���ˣ����-128��127֮������ݣ�����һ�����ݻ���أ���������Ǹ÷�Χ�ڵģ�ÿ�β��������µĿռ�
		// Integer ii = Integer.valueOf(127);
	}
}

