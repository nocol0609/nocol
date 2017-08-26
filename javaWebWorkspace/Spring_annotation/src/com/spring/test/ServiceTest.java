package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.web.Service;

/**
 * ��ͳ��ʽ����
 * 
 * @author Nocol
 *
 */
public class ServiceTest {
	@Test
	public void serviceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mix.xml");
		Service service = (Service) context.getBean("Service");
		service.sayHello();
	}
}
