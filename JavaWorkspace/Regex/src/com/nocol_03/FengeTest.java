package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �ָ����ϰ
 */
public class FengeTest {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s1 = "aa,bb,cc";
		//����ָ����
		String regex=",";
		//�����ַ����������
		String[] str1Array = s1.split(regex);
		for (int x = 0; x < str1Array.length; x++) {
			System.out.println(str1Array[x]);
		}
		System.out.println("---------------------");

		String s2 = "aa.bb.cc";
		//String Regex="\\."
		//String[] str2Array=s2.split(Regex);
		String[] str2Array = s2.split("\\.");//����"."������"\."��ʾ
		for (int x = 0; x < str2Array.length; x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("---------------------");

		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +"); //�ո�+��ʾ�Կո�Ϊ�ָ����һ�λ��γ���
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("---------------------");
		
		//Ӳ���ϵ�·��E:\JavaSE\day14\avi���ŵ�����Ӧ����\\���\
		String s4 = "E:\\JavaSE\\day14\\avi"; //��һ��ת��
		String[] str4Array = s4.split("\\\\");//�ڶ���ת��
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");
	}
}
