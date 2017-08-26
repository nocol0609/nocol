package com.spring.yilai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YiLaiTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee");
		System.out.println(employee);
	}
}
