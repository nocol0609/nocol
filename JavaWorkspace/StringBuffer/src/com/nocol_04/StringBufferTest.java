package com.nocol_04;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �����⣺
 * 1��String,StringBuffer,StringBuilder������?
 * 
 * A:String�����ݲ��ɱ�ģ���StringBuffer,StringBuilder�������ݿɱ�ġ�
 * B:StringBuffer��ͬ���ģ����ݰ�ȫ,Ч�ʵ�;StringBuilder�ǲ�ͬ����,���ݲ���ȫ,Ч�ʸ�
 * 
 * 2��StringBuffer�����������?
 * ���߶����Կ�����һ��������װ���������ݡ�
 * ������,StringBuffer������������һ���ַ������ݡ�
 * ��������Է��ö������ݣ���������ͬһ���������͵ġ�
 * 
 * 3:��ʽ��������
 * String��Ϊ��������
 * StringBuffer��Ϊ�������� 
 * 
 * ��ʽ������
 * 		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 * 
 * ע�⣺
 * 		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ���ġ�
 */
public class StringBufferTest{
	public static void main(String[] args) {
		String s1 = "hello";//�ַ�������ֱ�ӷŵ�"hello"���ֵ
		String s2 = "world";//�ַ�������ֱ�ӷŵ�"world"���ֵ
		System.out.println(s1 + "---" + s2);// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// hello---world   //����
		                                                  //String����һ����ֵ���ɱ�

		StringBuffer sb1 = new StringBuffer("hello");//�ŵ���StringBuffer����
		StringBuffer sb2 = new StringBuffer("world");//�ŵ���StringBuffer����
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld  //sb1����
                                                                  //sb2���˷����ı�
	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		s1 = s2;//s1:world
		s2 = s1 + s2;//s2:worldworld
		
		//���ǣ�����main��������s1��s2��ֵû�иı䣬��Ϊ�ַ����ǳ���ֵ����String��һ�������
		//�������ͣ�ֻ�ܵ����������������������� ���βθı��ʵ����Ӱ��
	}
}
