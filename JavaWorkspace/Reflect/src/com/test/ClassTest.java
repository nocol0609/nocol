package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	
	//����������������
	public static Object getInstance(String name) throws Exception{
		Class<?> c = Class.forName(name);
		//return c.newInstance();
//		//��ȡ����������public���޲ι�����
//		Constructor con = c.getConstructor();
//		return con.newInstance();
		
		//��ȡ��ȡ����������public�Ĵ��ι�����
		Constructor<?> con = c.getConstructor(String.class,int.class);//String��int���ֽ��루ģ�壩����
		return con.newInstance("tom",10);
	}
	
	//���ݶ�������������������������
	public static void fieldOper(Object obj,String fieldName,Object value) throws Exception{
		Class<? extends Object> c = obj.getClass();
		Field field = c.getDeclaredField(fieldName);
		System.out.println("ԭ�����Ե�ֵ:"+field.get(obj));
		field.set(obj, value);
		System.out.println("�ı���Զ�ֵ:"+field.get(obj));
	}
	
	//���ݶ����Լ��������ƣ����÷���
	public static void methodOper(Object obj,String methodName,Class[] argType ,Object...args) throws Exception{
		Class c = obj.getClass();
		Method method = c.getDeclaredMethod(methodName, argType);
		Object result = method.invoke(obj, args);
		System.out.println("����ִ�к�Ľ��:"+result);
		
	}
	
	public static void main(String[] args) throws Exception {
		Object obj = getInstance("com.test.Person");
		System.out.println(obj);
		fieldOper(obj, "age", 100);
		//fieldOper(obj, "name", "jack");//name˽�����ԣ����ܲ���
		methodOper(obj, "setName", new Class[]{String.class}, "jack");
		System.out.println(obj); 
	}
}

