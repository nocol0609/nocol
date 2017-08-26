package com.nocol.pattern.create.Singleton;

public class Singleton4 {  

	/* 持有私有静�?�实例，防止被引用，此处赋�?�为null，目的是实现延迟加载 */  
	private static Singleton4 instance = null;  

	/* 私有构�?�方法，防止被实例化 */  
	private Singleton4() {  
	}  

	/* 静�?�工程方法，创建实例 */  
	public static Singleton4 getInstance() {  
		if (instance == null) { 
		    synchronized (instance) {  
		        if (instance == null) {  
		            instance = new Singleton4();  
		        }  
		    }  
		}  
		return instance;  
	}  	

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持�?�? */  
	public Object readResolve() {  
	    return instance;  
	}  
}  
