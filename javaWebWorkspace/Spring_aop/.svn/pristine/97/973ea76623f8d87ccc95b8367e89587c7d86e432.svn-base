package com.spring.jdkproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 匿名方式实现jdk动态代理
 * @author Nocol
 *
 */
public class Test {
	public static void main(String[] args) {
		
		//目标对象
		final UserDao dao=new UserDaoImpl();
		
		//创建代理对象
		UserDao proxyDao=(UserDao)Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				
				/**
				 * 在目标对象调用方法前执行代理操作
				 */
				System.out.println("开始代理....");
				/**
				 * 目标对象调用方法
				 */
				Object obj = method.invoke(dao, args);	
				/**
				 * 在目标对象调用方法后执行代理操作
				 */
				System.out.println("结束代理....");
				
				return obj;
			}
		});
		
		proxyDao.add();
		
		//proxyDao.delete();
	}
}

