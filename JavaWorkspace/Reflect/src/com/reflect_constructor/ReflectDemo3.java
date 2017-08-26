package com.reflect_constructor;

import java.lang.reflect.Constructor;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ����ͨ�������ȡ ˽�й��췽�� ��ʹ��
 * private Person(String name){}
 * 
 * Person p = new Person("��ɵ��");
 * System.out.println(p);
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.nocol_01.Person");

		// ��ȡ˽�й��췽������
		// NoSuchMethodException��ÿ����������쳣
		// ԭ����һ��ʼ����ʹ�õķ���ֻ�ܻ�ȡ�����ģ��������ַ�ʽ�Ϳ����ˡ�
		Constructor con = c.getDeclaredConstructor(String.class);

		// �ø�˽�й��췽����������
		// IllegalAccessException:�Ƿ��ķ����쳣��
		// ��������
		con.setAccessible(true);// ֵΪtrue��ָʾ����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ�顣
		
		/*
		 * Person p = new Person("��ɵ��");
         * System.out.println(p);
		 * 
		 */
		
		Object obj = con.newInstance("��ɵ��");
		System.out.println(obj);
	}
}