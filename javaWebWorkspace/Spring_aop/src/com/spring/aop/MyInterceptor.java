package com.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * ��ͳSpring aop ʵ��
 * @author Nocol
 *
 */
public class MyInterceptor implements MethodInterceptor {
	
	/**
	 * ����֪ͨ
	 */
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		/**
		 * Ŀ�������÷���ǰ��ǿ
		 */
		System.out.println("����ǰ��ǿ...");
		/**
		 * Ŀ�����ִ�з���
		 */
		Object obj = methodInvocation.proceed();
		/**
		 * Ŀ�������÷�������ǿ
		 */
		System.out.println("���ƺ���ǿ...");
		
		return obj;
	}

}
