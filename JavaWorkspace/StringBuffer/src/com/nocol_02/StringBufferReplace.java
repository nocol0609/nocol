package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer���滻���ܣ�
 * public StringBuffer replace(int start,int end,String str):��start��ʼ��end��str�滻
 */
public class StringBufferReplace {
	public static void main(String[] args) {
		//�����ַ��������
		StringBuffer sb=new StringBuffer();
		//�������
		sb.append("hello").append("javaSE");
		System.out.println("�滻ǰsb:"+sb);
		//�滻����
		//sb.replace(5, 11, "javaEE");
		//System.out.println("�滻��sb:"+sb);
		// ���󣺰�world��������滻Ϊ"�������"
				sb.replace(5, 11, "�������");//���󲻰���
				System.out.println("�滻��sb:" + sb);
	}
}
