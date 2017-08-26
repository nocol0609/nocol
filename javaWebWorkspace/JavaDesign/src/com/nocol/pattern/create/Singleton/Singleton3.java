package com.nocol.pattern.create.Singleton;

public class Singleton3 {  

	/* 持有私有静�?�实例，防止被引用，此处赋�?�为null，目的是实现延迟加载 */  
	private static Singleton3 instance = null;  

	/* 私有构�?�方法，防止被实例化 */  
	private Singleton3() {  
	}  

	/* 静�?�工程方法，创建实例 this.getClass()*/  
	public static synchronized Singleton3 getInstance() {  
		if (instance == null) {  
		    instance = new Singleton3();  
		}
		return instance;  
	}  	

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持�?�? */  
	public Object readResolve() {  
	    return instance;  
	}  
}  
