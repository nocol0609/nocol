package com.spring.yilai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YiLaiTest {
	@Test
	//构造器注入
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("Student");
		//若未依赖注入构造函数的参数则报异常（无无参构造）
		System.out.println(student);
	}
	
	
	@Test
	//setter方式注入
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee");
		System.out.println(employee);
	}
	
	@Test
	//使用p命名空间注入（简化setter方式）
	public void test3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee2");
		System.out.println(employee);
	}
	
	@Test
	//spEL注入
	public void test4() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee3");
		System.out.println(employee);
	}
	
	@Test
	//集合类型注入
		public void test5() {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CollectionBean collectionBean=(CollectionBean) context.getBean("CollectionBean");
			System.out.println(collectionBean);
		}
	
	
}
