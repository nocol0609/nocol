package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServlet {

	// 依赖注入(Spring在构造UserServlet对象时同时将构造好的UserService对象注入UserServlet对象)
	private UserService service;

	public void setUserService(UserService service) {
		this.service = service;
	}

	public void regist() {
		System.out.println("表现层----添加用户");
		
		// //传统做法
		// UserService service=new UserServieImpl();
		// service.regist();

//		// 从Ioc容器中获取
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService service = (UserService) context.getBean("UserService");

		service.regist();
	}
}
