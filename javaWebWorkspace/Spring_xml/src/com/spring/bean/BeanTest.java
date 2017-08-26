package com.spring.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	@Test
	public void test(){
		System.out.println("bean1...............");
		//获取工厂
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过工厂获取对象
		Bean1 bean1=(com.spring.bean.Bean1) context.getBean("Bean1");
		System.out.println(bean1);
	}
	
	@Test
	public void test2(){
		System.out.println("bean2.................");
		//获取工厂
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过工厂获取对象
		Bean2 bean2= (com.spring.bean.Bean2) context.getBean("Bean2");
		System.out.println(bean2);
	}
	
	@Test
	public void test3(){
		System.out.println("bean3..............");
		//获取工厂
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过工厂获取对象
		Bean3 bean3= (com.spring.bean.Bean3) context.getBean("Bean3");
		System.out.println(bean3);
	}
	
}	
