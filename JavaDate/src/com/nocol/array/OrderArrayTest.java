package com.nocol.array;

/**
 * �����Զ�����������
 *	
 * @author Nocol ����2:45:30
 */
public class OrderArrayTest {
	public static void main(String[] args) {
		OrderArray orderArray=new OrderArray(10);  //���������ʼ������Ϊ10
		
		orderArray.insert(32);
		orderArray.insert(12);
		orderArray.insert(38);
		orderArray.insert(18);
		
		orderArray.display();   //������˳���޹أ�����ʱ��ʱ�������
		
		System.out.println(orderArray.binarySearch(38));
	}
}
