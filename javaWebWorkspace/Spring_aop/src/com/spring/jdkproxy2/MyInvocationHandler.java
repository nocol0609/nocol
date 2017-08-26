package com.spring.jdkproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
	
	//Ŀ�����
	private UserDao dao;
	
	//����Ŀ�����
	public MyInvocationHandler(UserDao dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		/**
		 * ��Ŀ�������÷���ǰ��ʼ����
		 */
		System.out.println("��ʼ����...");
		/**
		 * Ŀ�������÷���
		 */
		Object obj = method.invoke(dao, args);
		/**
		 * ��Ŀ�������÷������������
		 */
		System.out.println("��������...");
		return obj;
	}
	
	/**
	 * ���ش������
	 */
	public Object getUserDaoProxy(){
		
		//����дֻ�Ƿ�����Ŀ�����û�з��ش������
		//return dao;
			
		//���ش������
//		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), 
//				this.dao.getClass().getInterfaces(), this);
		
		return Proxy.newProxyInstance(dao.getClass().getClassLoader(), 
				this.dao.getClass().getInterfaces(), this);
		
		
	}
}
