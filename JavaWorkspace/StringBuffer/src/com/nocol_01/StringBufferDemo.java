package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �̰߳�ȫ(���߳̽���)
 * ��ȫ -- ͬ�� -- �����ǰ�ȫ��
 * ����ȫ -- ��ͬ�� -- Ч�ʸ�һЩ
 * ��ȫ��Ч����������Զ�������ǵ����⡣
 * ��ȫ��ҽԺ����վ��������վ
 * Ч�ʣ�������վ����̳֮���
 * 
 * StringBuffer:
 * 		�̰߳�ȫ�Ŀɱ��ַ�����
 * 
 * StringBuffer��String������?
 * ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ䡣
 * ���ʹ��ǰ�����ַ�����ƴ�ӣ������˷�̫�����Դ��
 * 
 * StringBuffer�Ĺ��췽����
 * 		public StringBuffer():�޲ι��췽��
 *		public StringBuffer(int capacity):ָ���������ַ�������������
 *		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
 *
 * StringBuffer�ķ�����
 *		public int capacity()�����ص�ǰ������	����ֵ
 *		public int length():���س��ȣ��ַ������� ʵ��ֵ
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer():�޲ι��췽��
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);//StringBuffer����дObjet���toString()��������ӡ��
		System.out.println("sb.capacity():" + sb.capacity());//StringBufferĬ������Ϊ16������ӡ16
		System.out.println("sb.length():" + sb.length());//��StringBufferδ������ݣ����Դ�ӡ0
		System.out.println("--------------------------");

		// public StringBuffer(int capacity):ָ���������ַ�������������
		StringBuffer sb2 = new StringBuffer(50);//50��ָ��������������С
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capacity():" + sb2.capacity());//50
		System.out.println("sb2.length():" + sb2.length());//0
		System.out.println("--------------------------");

		// public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("hello");//StringBuffer������ͨ�����췽���������"hello"
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capacity():" + sb3.capacity());//16+5=21
		System.out.println("sb3.length():" + sb3.length());//5
	}
}