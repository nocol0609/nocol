package com.spring.jdkproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
	
	//目标对象
	private UserDao dao;
	
	//传入目标对象
	public MyInvocationHandler(UserDao dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		/**
		 * 在目标对象调用方法前开始代理
		 */
		System.out.println("开始代理...");
		/**
		 * 目标对象调用方法
		 */
		Object obj = method.invoke(dao, args);
		/**
		 * 在目标对象调用方法后结束代理
		 */
		System.out.println("结束代理...");
		return obj;
	}
	
	/**
	 * 返回代理对象
	 */
	public Object getUserDaoProxy(){
		
		//这样写只是返回了目标对象并没有返回代理对象
		//return dao;
			
		//返回代理对象
//		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), 
//				this.dao.getClass().getInterfaces(), this);
		
		return Proxy.newProxyInstance(dao.getClass().getClassLoader(), 
				this.dao.getClass().getInterfaces(), this);
		
		
	}
}
