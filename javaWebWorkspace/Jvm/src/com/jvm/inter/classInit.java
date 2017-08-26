package com.jvm.inter;

/**
 * 类的初始化时机：
 * 		调用classLoader类的loadClass方法加载一个类，并不是对类的
 * 主动使用，不会导致类的初始化。（不是六种情况之一）
 * 
 *      而使用反射：Class.forName("com.jvm.inter.classLoder") 则会导致对类的初始化
 * 	
 * @author Nocol
 *
 */

class classLoder{
	
	static{
		System.out.println("class classloder");
	}
}

public class classInit {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//获取系统类加载器
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		 
		//加载类（不会初始化加载的类）
		Class<?> clazz = loader.loadClass("com.jvm.inter.classLoder");
		
		System.out.println("---------------------------");
		
		clazz=Class.forName("com.jvm.inter.classLoder");
	}
}
