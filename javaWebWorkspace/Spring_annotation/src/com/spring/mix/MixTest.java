package com.spring.mix;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.UserService;

public class MixTest {
	@Test
	public void test() {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext-mix.xml");
		OderService service=(OderService) context.getBean("OderService");
		service.add();
	}
}
