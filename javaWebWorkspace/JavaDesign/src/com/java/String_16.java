package com.java;

/*
 * ��дһ��������һ��ʮ�����������ַ�������ת�����������ء�
 */
public class String_16 {
	public static void main(String[] args) {

		// ��ʽһ��������ʵ��
		int num = Integer.parseInt("2862", 16);// ��16 ������2862ת����10��������
		System.out.println("����ʵ�֣�"+num);

		// ��ʽ�����ֶ�ʵ��
		String str = "2862";//16����
		int len = str.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			// ����ָ���������� char ֵ��
			char c = str.charAt(len - 1 - i);
			// ����ʹ��ָ���������ַ� ch ����ֵ��
			int num2 = Character.digit(c, 16);
			sum += num2 * (1 << (4 * i));
		}
		System.out.println("�ֶ�ʵ�֣�"+sum); 
		
		//=====================
		System.out.println(2>>3);
	}
}
