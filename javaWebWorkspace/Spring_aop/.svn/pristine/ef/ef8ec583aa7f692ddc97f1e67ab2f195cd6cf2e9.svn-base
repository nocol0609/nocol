package com.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * 传统Spring aop 实现
 * @author Nocol
 *
 */
public class MyInterceptor implements MethodInterceptor {
	
	/**
	 * 环绕通知
	 */
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		/**
		 * 目标对象调用方法前增强
		 */
		System.out.println("环绕前增强...");
		/**
		 * 目标对象执行方法
		 */
		Object obj = methodInvocation.proceed();
		/**
		 * 目标对象调用方法后增强
		 */
		System.out.println("环绕后增强...");
		
		return obj;
	}

}
