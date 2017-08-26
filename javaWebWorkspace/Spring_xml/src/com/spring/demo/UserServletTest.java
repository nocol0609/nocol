package com.spring.demo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class UserServletTest {
	/**
	 * 传统方式,手动new对象
	 */
	// @Test
	// public void test() {
	// UserServlet servlet = new UserServlet();
	// servlet.regist();
	// }

	/**
	 * 从ioc容器获取对象
	 */
	@Test
	public void test2() {
		// 获取工厂对象 //加载src下资源文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从ioc容器中获取对象(根据id获取)
		UserServlet servlet = (UserServlet) context.getBean("UserServlet");
		servlet.regist();
	}

	/**
	 * 使用BeanFactory 构造容器工厂
	 */
	@Test
	public void test3() {
		// 获取工厂对象 //加载src下资源文件
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		// 从ioc容器中获取对象(根据id获取)
		UserServlet servlet = (UserServlet) factory.getBean("UserServlet");
		servlet.regist();  //只打印一行日志 
	}

}
