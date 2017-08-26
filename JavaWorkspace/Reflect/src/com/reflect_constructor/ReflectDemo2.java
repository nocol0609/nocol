package com.reflect_constructor;

import java.lang.reflect.Constructor;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ����ͨ������ȥ��ȡ�ù��췽����ʹ�ã�
 * public Person(String name, int age, String address)
 * 
 * ���������´��룺
 * Person p = new Person("��˧��",27,"�ϲ�");
 * System.out.println(p);
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.nocol_01.Person");

		// ��ȡ���ι��췽������
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class, int.class,String.class);

		// ͨ�����ι��췽�����󴴽�����
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance("��˧��",27,"�ϲ�");
		
		System.out.println(obj);
	}
}

