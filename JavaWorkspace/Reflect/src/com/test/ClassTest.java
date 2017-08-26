package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	
	//根据类名构建对象
	public static Object getInstance(String name) throws Exception{
		Class<?> c = Class.forName(name);
		//return c.newInstance();
//		//获取类中声明的public的无参构造器
//		Constructor con = c.getConstructor();
//		return con.newInstance();
		
		//获取获取类中声明的public的带参构造器
		Constructor<?> con = c.getConstructor(String.class,int.class);//String和int的字节码（模板）对象
		return con.newInstance("tom",10);
	}
	
	//根据对象和属性名，操作对象的属性
	public static void fieldOper(Object obj,String fieldName,Object value) throws Exception{
		Class<? extends Object> c = obj.getClass();
		Field field = c.getDeclaredField(fieldName);
		System.out.println("原来属性的值:"+field.get(obj));
		field.set(obj, value);
		System.out.println("改变后自动值:"+field.get(obj));
	}
	
	//根据对象以及方法名称，调用方法
	public static void methodOper(Object obj,String methodName,Class[] argType ,Object...args) throws Exception{
		Class c = obj.getClass();
		Method method = c.getDeclaredMethod(methodName, argType);
		Object result = method.invoke(obj, args);
		System.out.println("方法执行后的结果:"+result);
		
	}
	
	public static void main(String[] args) throws Exception {
		Object obj = getInstance("com.test.Person");
		System.out.println(obj);
		fieldOper(obj, "age", 100);
		//fieldOper(obj, "name", "jack");//name私有属性，不能操作
		methodOper(obj, "setName", new Class[]{String.class}, "jack");
		System.out.println(obj); 
	}
}

