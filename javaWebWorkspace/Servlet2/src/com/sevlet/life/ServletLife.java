package com.sevlet.life;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class ServletLife extends HttpServlet {
	//构造方法
	public ServletLife() {
		System.out.println("Servlet对象被创建了");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("调用了init()方法");
	} 
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service()方法被调用");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()方法被调用");
	} 
}
