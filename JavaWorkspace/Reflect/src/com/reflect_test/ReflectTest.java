package com.reflect_test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �Ҹ���ArrayList<Integer>��һ������������������������һ���ַ������ݣ����ʵ���أ�
 * 
 * 		����ǰѧ���Ĳ���ʵ�֣���Ϊ�÷���ָ����Integer���ͣ����ַ�������ʱ����ͻᱨ��
 * 
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception  {
		//��������
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		//��ȡclass�ļ�����(�Ѿ�֪���������array�����Բ�����ͨ��c��ȡ�����)
		Class c=array.getClass();
		
		//��ȡ��������
        //Method m=c.getMethod("add", String.class);  //����
		//ArrayList��add()�����У��ײ����Ĭ�����Object����add(E e),����ֻ��Ϊ�˸����뿴�ģ��������л��ǿ�class�ļ�
		Method m=c.getMethod("add", Object.class);
		m.invoke(array, "hello"); //�ַ���
		m.invoke(array, "100");//����
		m.invoke(array, 13.14f);//������
       //���÷�����򼯺���Ӹ����������ݣ���������������ָ��������
		System.out.println(array);
	}
}
