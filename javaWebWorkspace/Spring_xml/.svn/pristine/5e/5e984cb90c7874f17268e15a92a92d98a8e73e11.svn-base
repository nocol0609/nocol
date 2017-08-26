package com.spring.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	/**
	 * 单例bean在容器初始化的时候就已经初始化,且只初始化一次
	 */
	@Test
	public void SingletonTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SingletonBean singletonBean1 = (SingletonBean) context.getBean("SingletonBean");
		SingletonBean singletonBean2 = (SingletonBean) context.getBean("SingletonBean");
		//返回同一个对象
		System.out.println(singletonBean1);//com.spring.scope.SingletonBean@6a8b11f5
		System.out.println(singletonBean2);//com.spring.scope.SingletonBean@6a8b11f5
	}
	
	/**
	 * 多例bean在容器初始化时没有被初始化，在getBean时初始化
	 */
	@Test
	public void PrototypeTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PrototypeBean prototypeBean1 = (PrototypeBean) context.getBean("PrototypeBean");
		PrototypeBean prototypeBean2 = (PrototypeBean) context.getBean("PrototypeBean");
		System.out.println(prototypeBean1);//com.spring.scope.PrototypeBean@7798d466
		System.out.println(prototypeBean2);//com.spring.scope.PrototypeBean@52a0b1e1
	}
}
