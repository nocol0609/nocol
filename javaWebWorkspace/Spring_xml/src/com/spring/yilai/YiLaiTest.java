package com.spring.yilai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YiLaiTest {
	@Test
	//������ע��
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("Student");
		//��δ����ע�빹�캯���Ĳ������쳣�����޲ι��죩
		System.out.println(student);
	}
	
	
	@Test
	//setter��ʽע��
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee");
		System.out.println(employee);
	}
	
	@Test
	//ʹ��p�����ռ�ע�루��setter��ʽ��
	public void test3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee2");
		System.out.println(employee);
	}
	
	@Test
	//spELע��
	public void test4() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("Employee3");
		System.out.println(employee);
	}
	
	@Test
	//��������ע��
		public void test5() {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CollectionBean collectionBean=(CollectionBean) context.getBean("CollectionBean");
			System.out.println(collectionBean);
		}
	
	
}
