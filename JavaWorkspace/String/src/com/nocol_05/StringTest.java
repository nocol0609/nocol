package com.nocol_05;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * ������
 * 		helloWORLD
 * �����
 * 		Helloworld
 * 
 * ������
 * 		A:�Ȼ�ȡ��һ���ַ�
 * 		B:��ȡ���˵�һ���ַ�������ַ�
 * 		C:��Aת�ɴ�д
 * 		D:��Bת��Сд
 * 		E:Cƴ��D
 */
public class StringTest {
	public static void main(String[] args) {
		//�����ַ���
		String s="helloWORLD";
		//��ȡ��һ���ַ�
		String s1=s.substring(0, 1);//���󲻰���
		//��ȡʣ�µ��ַ�
		String s2=s.substring(1);
		//����һ���ַ�װ���ɴ�д
		String s3=s1.toUpperCase();
		//��ʣ���ַ�װ����Сд
		String s4=s2.toLowerCase();
		//��װ������ַ����ַ���ƴ��
		//String s5=s3+s4;
		String s5=s3.concat(s4);
		//����ַ���
		System.out.println(s5);
		
		//��ʽ���
		String result=null;
		result=s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(result);
	}
}
