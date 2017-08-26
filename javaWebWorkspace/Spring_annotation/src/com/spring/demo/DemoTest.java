package com.spring.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
	@Test
	/**
	 * ×¢½âservice²ã
	 */
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService) context.getBean("UserService");
		System.out.println(service);
	}
}
