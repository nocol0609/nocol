package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer�Ľ�ȡ����:ע�ⷵ��ֵ���Ͳ�����StringBuffer������
 * public String substring(int start)    //�ӽ�ȡ����ĩβ
 * public String substring(int start,int end) //��ָ��λ�ý�ȡ��ָ��λ�ý���
 */
public class StringBufferJieQu {
	public static void main(String[] args) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// ���Ԫ��
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// ��ȡ����
		// public String substring(int start)
		String s = sb.substring(5);
		System.out.println("s:" + s);//worldjava
		System.out.println("sb:" + sb);//sb:helloworldjava,��ȡ������ı�

		// public String substring(int start,int end)
		//���󣺽�world��ȡ����
		String ss = sb.substring(5, 10);
		System.out.println("ss:" + ss);//ss:world
		System.out.println("sb:" + sb);//sb:helloworldjava
	}
}
