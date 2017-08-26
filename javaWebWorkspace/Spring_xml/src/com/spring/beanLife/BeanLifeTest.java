package com.spring.beanLife;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {

	/**
	 * 在容器初始化的时候，bean对象同时创建并立即初始化
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/**
		 * 获取bean对象时会执行代理
		 */
		ProxyInterface lifeCycleBean = (ProxyInterface) context.getBean("lifeCycleBean");
		

		/**
		 * 必须手动调用容器销毁的方法-----web服务器tomcat自动调用容器销毁
		 * 
		 * （改成ClassPathXmlApplicationContext类型）
		 */
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// context.close();
	}
}
