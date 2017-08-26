package com.servletcontext;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取ServletContext对象
		//ServletContext context=this.getServletConfig().getServletContext();
		ServletContext context = this.getServletContext();
		
//		//获取web应用路径
//		/**
//		 * Web应用路径：部署到tomcat上的项目名称
//		 */
//		String contextPath = context.getContextPath();
//		//System.out.println(contextPath);
//		//用于重定向的资源名称
//		response.sendRedirect(contextPath+"a.html");
		
		/**
		 * 获取web初始化参数
		 */
		String parameterName = context.getInitParameter("AAA");
		System.err.println(parameterName);
		//获取全部web初始化参数
		Enumeration<String> Enumer = context.getInitParameterNames();
		while (Enumer.hasMoreElements()) {
			String enumerName  =  Enumer.nextElement();
			String enumberValue =context.getInitParameter(enumerName);
			System.out.println(enumerName+enumberValue);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
