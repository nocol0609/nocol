package com.nocol.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstSevlet implements Servlet {

	public FirstSevlet() {
		System.out.println("this is FirstServlet 无参构造器");
	}

	@Override
	public void destroy() {
		System.out.println("destroy()方法被执行");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()方法被执行");
		Enumeration<String> enumeration = config.getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + "---" + value);
		}
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service()方法被执行");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>测试</title></head>");
		Double random = Math.random();
		out.println("<body><font size='6'><b>" + random + "</b></font></body></html>");
		out.flush();
		out.close();
	}
}
