package com.nocol_02;

import com.nocol_01.BubbleSort;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���ַ����е��ַ���������
 * 		������"dacgebf"
 * 		�����"abcdefg"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ���ת��Ϊ�ַ�����
 * 		C:���ַ������������
 * 		D:���������ַ�����ת���ַ���
 * 		E:��������ַ���
 */
public class ArrayTest {
	public static void main(String[] args) {
		//����һ���ַ���
		String s="dacgebf";
		System.out.println("����ǰ���ַ���Ϊ��"+s);
		//���ַ���ת��Ϊ�ַ�����
		char[] chs=s.toCharArray();
		//���ַ������������
	    bubbleSort(chs);
		//���������ַ�����ת���ַ���
		String result=String.valueOf(chs);
		//��������ַ���
		System.out.println("�������ַ���Ϊ��"+result);
	}
   //����ð������
	private static void bubbleSort(char[] chs) {
		// TODO Auto-generated method stub
		for(int x=0;x<chs.length-1;x++){
			for(int y=0;y<chs.length-1-x;y++){
				if(chs[y]>chs[y+1]){   //����ķŵ�ǰ��
					char tem=chs[y];
					chs[y]=chs[y+1];
					chs[y+1]=tem;
				}
			}
		}
	}
}
