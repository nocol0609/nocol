package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���õĻ�������ת��
 * public static String toBinaryString(int i)
 * public static String toOctalString(int i)
 * public static String toHexString(int i)
 * 
 * ʮ���Ƶ���������
 * public static String toString(int i,int radix)
 * ���������Ҳ�����˽��Ƶķ�Χ��2-36������������ԭֵ
 * Ϊʲô��?0,...9,a...z
 * 
 * �������Ƶ�ʮ����
 * public static int parseInt(String s,int radix)
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		// ʮ���Ƶ������ƣ��˽��ƣ�ʮ������
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");

		// ʮ���Ƶ���������
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, -7));//100
		System.out.println(Integer.toString(100, 70));//100
		System.out.println(Integer.toString(100, 1));//100
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 32));
		System.out.println(Integer.toString(100, 37));//100
		System.out.println(Integer.toString(100, 36));
		System.out.println("-------------------------");
		
		//�������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100", 10));//10���Ʊ�ʾ��100ת����10����
		System.out.println(Integer.parseInt("100", 2));//2���Ʊ�ʾ��100ת����10����
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 23));
		//NumberFormatException
		//System.out.println(Integer.parseInt("123", 2));//123����2�����ܱ�ʾ��
	}
}
