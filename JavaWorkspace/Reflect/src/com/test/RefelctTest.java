package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RefelctTest {
	
	public static void printClass(String name) throws Exception{
		Class c = Class.forName(name);
		System.out.println(c.getPackage()+",");
		System.out.println(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{");
		//获取当前类中所有的属性（包括私有）
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("\t"+Modifier.toString(field.getModifiers())+" "+field.getType().getSimpleName()+" "+field.getName()+";");
		}
		//类中声明构造器18501725837  02156478147
		Constructor[] constructors = c.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("\t"+constructor);
		}
		//类中申明的方法
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println("\t"+method+"{}");
		}
		
		System.out.println("}");
	}
	
	
	
	public static void main(String[] args) throws Exception {
//		
//		Class<?> c = Class.forName("com.test.Person");
//		Person person=new Person();
//		Class class1 = person.getClass();
//		Constructor<?> constructor = c.getConstructor();
//		Object object = constructor.newInstance();
//		System.out.println(object);
		
		RefelctTest rt=new RefelctTest();
		rt.printClass("com.test.Person");
	}      
}
