package com.spring.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebServlet("/hello")
public class Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 未加监听，每一次请求都创建一次Spring容器
		 */
		// // 获取工厂
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext-mix.xml");
		// // 获取bean对象
		// Service service = (Service) context.getBean("Service");
		// service.sayHello();

		/**
		 * 增加监听，在服务器启动时加载Spring容器，且只会加载一次
		 */
		// 服务器启动时加载Spring容器并将存入域中，这里只需取出来即可

		// 获取Spring容器：方式一
		// ApplicationContext context=(ApplicationContext)
		// this.getServletContext().getAttribute("WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE");

		// 获取Spring容器：方式二
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		Service service = (Service) context.getBean("Service");
		service.sayHello();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
