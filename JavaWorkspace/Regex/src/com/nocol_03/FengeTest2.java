package com.nocol_03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ������һ���ַ���:"91 27 46 38 50"��ע�����ַ������������飩
 * ��д����ʵ�������������ǣ�"27 38 46 50 91"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ������зָ�õ�һ���ַ�������
 * 		C:���ַ�������任��int����
 * 		D:��int��������
 * 		E:��������int��������װ��һ���ַ���
 * 		F:����ַ���
 */
public class FengeTest2 {
	public static void main(String[] args) {
		String s1="91 27 46 38 50";
		String regex=" ";
		String[] strArray=s1.split(regex);
		//���ַ�������任��int����
		int[] arr=new int[strArray.length];//int�������ַ������鳤����ͬ
		
		for (int x = 0; x < arr.length; x++) {
			arr[x]=Integer.parseInt(strArray[x]);
		}
		//��int�����������
		Arrays.sort(arr);
		
		//��������int��������װ��һ���ַ���
		
		/*StringBuilder sb=new StringBuilder();
		for (int x = 0; x < arr.length; x++) {
			sb.append(arr[x]).append(" ");
		}*/
		
		String s="";
		for(int x=0;x<arr.length;x++){
			s+=arr[x];
			s+=" ";
		}
		
		//ת��Ϊ�ַ���
		String result = s.toString().trim(); //����String���µķ���
		System.out.println(result);
	}
}
