package com.sevlet.life;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class ServletLife extends HttpServlet {
	//���췽��
	public ServletLife() {
		System.out.println("Servlet���󱻴�����");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("������init()����");
	} 
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service()����������");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()����������");
	} 
}
