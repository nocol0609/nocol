package com.spring.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	/**
	 * ����bean��������ʼ����ʱ����Ѿ���ʼ��,��ֻ��ʼ��һ��
	 */
	@Test
	public void SingletonTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SingletonBean singletonBean1 = (SingletonBean) context.getBean("SingletonBean");
		SingletonBean singletonBean2 = (SingletonBean) context.getBean("SingletonBean");
		//����ͬһ������
		System.out.println(singletonBean1);//com.spring.scope.SingletonBean@6a8b11f5
		System.out.println(singletonBean2);//com.spring.scope.SingletonBean@6a8b11f5
	}
	
	/**
	 * ����bean��������ʼ��ʱû�б���ʼ������getBeanʱ��ʼ��
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
