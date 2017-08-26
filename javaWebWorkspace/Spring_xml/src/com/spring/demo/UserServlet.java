package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServlet {

	// ����ע��(Spring�ڹ���UserServlet����ʱͬʱ������õ�UserService����ע��UserServlet����)
	private UserService service;

	public void setUserService(UserService service) {
		this.service = service;
	}

	public void regist() {
		System.out.println("���ֲ�----����û�");
		
		// //��ͳ����
		// UserService service=new UserServieImpl();
		// service.regist();

//		// ��Ioc�����л�ȡ
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService service = (UserService) context.getBean("UserService");

		service.regist();
	}
}
