package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer��ɾ������
 * public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý���������(���󲻰���)�������ر���
 */
public class StringBufferDelete {
	public static void main(String[] args) {
		// ��������
		StringBuffer sb = new StringBuffer();

		// ���ӹ���
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		// public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
		// ����ɾ��e����ַ�
		// sb.deleteCharAt(1);
		// ����:ɾ����һ��l����ַ�
		// sb.deleteCharAt(1);

		// public StringBuffer delete(int start,int
		// end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
		// ����ɾ��world����ַ���
		// sb.delete(5, 10);//���󲻰���

		// ����:ɾ�����е�����
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);//��ӡ��
	}
}