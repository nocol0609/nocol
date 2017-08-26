package com.nocol.pattern.create.Singleton;

//�?单的单例�?2 懒汉模式
public class Singleton2 {  

	/* 持有私有静�?�实例，防止被引用，此处赋�?�为null，目的是实现延迟加载 */  
	private static Singleton2 instance = null;  
	private static Object o=new Object();
	/* 私有构�?�方法，防止被实例化 */  
	private Singleton2() {  
	}  

	/* 静�?�工程方法，创建实例 */  
	public static Singleton2 getInstance() {  
	    synchronized (o) {
			if (instance == null) {
				instance = new Singleton2();
			}
		}
		return instance;  
	}  

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持�?�? */  
	public Object readResolve() {  
	    return instance;  
	}  
}  
