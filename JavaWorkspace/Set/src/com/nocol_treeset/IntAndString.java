package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * int���ͺ�String���͵��໥ת��
 * 
 * int -- String
 * 		String.valueOf(number)
 * 
 * String -- int
 * 		Integer.parseInt(s)
 * 
 * ���䣺String -- float
 *      Float.parseInt(s)
 *      String -- double
 *      Double.parseInt(s)
 *      .....
 */
public class IntAndString {
	public static void main(String[] args) {
		// intת���� String
		int number = 100;
		// ��ʽ1
		String s1 = "" + number;
		System.out.println("s1:" + s1);
		// ��ʽ2
		String s2 = String.valueOf(number);//String����valueOf�ɽ��κ�����ת����String����
		System.out.println("s2:" + s2);
		// ��ʽ3
		// int -- Integer -- String
		Integer i = new Integer(number);
		String s3 = i.toString(); //Interger������дtoString()����
		System.out.println("s3:" + s3);
		// ��ʽ4
		// public static String toString(int i)  //����int��String����
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);
		System.out.println("-----------------");

		// String ת���� int
		String s = "100";
		// ��ʽ1
		// String -- Integer -- int
		Integer ii = new Integer(s);//��תIntefer
		// public int intValue()  //Integer���½�Integerת���ɹ�int�ķ���
		int x = ii.intValue();
		System.out.println("x:" + x);
		//��ʽ2
		//public static int parseInt(String s)  //����String��int����
		int y = Integer.parseInt(s);
		System.out.println("y:"+y);
	}
}
