package com.reflect_propertiy;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 反射中配置文件的应用
 */
public class PropertyDemo {
	public static void main(String[] args) throws Exception {
//		//反射前的做法
//		Student s=new Student();
//		s.love();
//		
//		Teacher t=new Teacher();
//		t.love();
//		
//		System.out.println("--------------");
//		
		//反射后的做法（不需要每次都造对象调方法，直接在配置文件内修改要用的类名和要调的方法即可）
		Properties prop=new Properties();
		FileReader file=new FileReader("property.txt");
		//加载配置文件
		prop.load(file); 
		file.close();
		
		//获取数据
		String className=prop.getProperty("className");
		String methodName=prop.getProperty("methodName");
		
		//获取class文件对象
		Class c=Class.forName(className);
		//通过class文件对象获取类对象
		Constructor con=c.getConstructor();
		Object obj=con.newInstance();
		//获取方法
		Method m1=c.getMethod(methodName);
		m1.invoke(obj);//无参
		
	}
}
