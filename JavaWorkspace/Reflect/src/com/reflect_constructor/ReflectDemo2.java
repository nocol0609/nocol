package com.reflect_constructor;

import java.lang.reflect.Constructor;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 需求：通过反射去获取该构造方法并使用：
 * public Person(String name, int age, String address)
 * 
 * 类似做以下代码：
 * Person p = new Person("大帅比",27,"南昌");
 * System.out.println(p);
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("com.nocol_01.Person");

		// 获取带参构造方法对象
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class, int.class,String.class);

		// 通过带参构造方法对象创建对象
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance("大帅比",27,"南昌");
		
		System.out.println(obj);
	}
}

