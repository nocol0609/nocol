package com.spring.life;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=(UserDao) context.getBean("UserDao");
		System.out.println(userDao);
		/**
		 * 反射调用销毁
		 */
		Method closeMethod=context.getClass().getMethod("close");
		try {
			closeMethod.invoke(context);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
