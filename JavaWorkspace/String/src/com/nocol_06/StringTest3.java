package com.nocol_06;
/**
* @author lxp
*
* @TODO  StringTest2 �����Ľ���
* 
*/
/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * �����
 * 		java������5��
 * 
 * ������
 * 		ǰ�᣺���Ѿ�֪���˴󴮺�С����
 * 
 * 		A:����һ��ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:���ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			a:������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b:��������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D:�ص�B
 */
public class StringTest3{
	public static void main(String[] args) {
		//�����
		String maxString="woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//����С��
		String minString="java";	
		//���ù���ʵ��
		int count=StringTest2.getCount(maxString, minString);
		System.out.println("java�ڴ��г��ֵĴ���Ϊ"+count+"��");
	}
	public static int getCount(String maxString,String minString ){
		//����ͳ�Ʊ���
		int count=0;
		
		/*//�����ڴ��в���һ��С����һ�γ��ֵ�λ��
		int index=maxString.indexOf(minString);
		
		while(index!=-1){
			count++;
			// �Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ�����
			// ���Ѹ��ַ�����ֵ���¸�ֵ����
			int startIndex=index+minString.length();
			maxString=maxString.substring(startIndex);
			//������
			index=maxString.indexOf(minString);
		}*/
		//�����Ľ�
		int index;
		while((index=maxString.indexOf(minString))!=-1){
			count++;
			maxString=maxString.substring(index+minString.length());
		}
		return count;
	}
}
