package com.nocol.object;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Object:�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
 * ÿ���඼ֱ�ӻ��߼�ӵļ̳���Object�ࡣ
 * 
 * Object��ķ�����
 * 		A:public int hashCode():���ظö���Ĺ�ϣ��ֵ��
 * 			ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�йأ����ǲ���ʵ�ʵ�ֵַ��
 * 			           ��������Ϊ��ֵַ��
 * 
 *		B:public final Class getClass():���ش� Object ������ʱ��   ,ָClass����ʲô��ͷ���ʲô��  
 *                                      //������������ֵ��ʵ�ʷ��ظ������
 *			Class��ķ�����
 *				public String getName()��        //�� String ����ʽ���ش� Class ��������ʾ��ʵ��
 */
//����ѧ����

class Student extends Object{
	//Student�̳г���Object����дĬ�� 
}
//Student�Ĳ�����
public class StudentDemo{  
	public static void main(String[] args) {
		Student s1=new Student();
		//hashCose()Ϊ����ķ����������ֱ�ӵ���
		System.out.println(s1.hashCode());   //1704856573
		
		Student s2=new Student();
		System.out.println(s2.hashCode());    //705927765
		
		Student s3=s1;
		System.out.println(s3.hashCode());     //1704856573
		
		System.out.println("--------------------------------");
		
		Student s=new Student();
		Class c=s.getClass();     //public final Class getClass()��������������ֵ��ʵ�ʷ��ظ���������Խ���
		
		String str=c.getName();
		System.out.println(str);   //��ӡcom.nocol.object.Student  �����ذ���������
		
		//��ʽ���
       String str2=s.getClass().getName();
       System.out.println(str2);    //��ӡcom.nocol.object.Student  �����ذ���������
	}
}
