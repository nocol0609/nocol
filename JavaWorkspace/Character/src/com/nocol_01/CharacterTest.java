package com.nocol_01;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * 
 * ������
 * 		A:��������ͳ�Ʊ�����
 * 			int bigCont=0;
 * 			int smalCount=0;
 * 			int numberCount=0;
 * 		B:����¼��һ���ַ�����
 * 		C:���ַ���ת��Ϊ�ַ����顣
 * 		D:�����ַ������ȡ��ÿһ���ַ�
 * 		E:�жϸ��ַ���
 * 			��д	bigCount++;
 * 			Сд	smalCount++;
 * 			����	numberCount++;
 * 		F:����������
 */
public class CharacterTest {
	public static void main(String[] args) {
		// ��������ͳ�Ʊ�����
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		// ����¼��һ���ַ�����
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s=sc.nextLine();
		// ���ַ���ת��Ϊ�ַ�����
		char[] chs=s.toCharArray();
		// ���ַ������ȡ��ÿһ���ַ�
		for(int x=0;x<chs.length;x++){
			char ch=chs[x];
			// �жϸ��ַ�
			if(Character.isUpperCase(ch)){
				bigCount++;
			}else if(Character.isLowerCase(ch)){
				smallCount++;
			}else if(Character.isDigit(ch)){
				numberCount++;
			}
		}
		// ����������
		System.out.println("��д��ĸ��" + bigCount + "��");
		System.out.println("Сд��ĸ��" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
	}
}