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
		//��ȡServletContext����
		//ServletContext context=this.getServletConfig().getServletContext();
		ServletContext context = this.getServletContext();
		
//		//��ȡwebӦ��·��
//		/**
//		 * WebӦ��·��������tomcat�ϵ���Ŀ����
//		 */
//		String contextPath = context.getContextPath();
//		//System.out.println(contextPath);
//		//�����ض������Դ����
//		response.sendRedirect(contextPath+"a.html");
		
		/**
		 * ��ȡweb��ʼ������
		 */
		String parameterName = context.getInitParameter("AAA");
		System.err.println(parameterName);
		//��ȡȫ��web��ʼ������
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
