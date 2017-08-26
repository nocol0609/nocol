package com.nocol.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 设置参数查询的码表
		 * 该方法只对请求实体中的内容器作用，Post提交的内容在实体内，起作用；
		 * 但是对Get方式提交的内容在url后不再实体内，所以该方法对Get方法无效
		 */
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		System.out.println("username==" + new String(name.getBytes()));
		System.out.println("password==" + pwd);
		System.out.println("==================================");

//		Enumeration<String> enumeration = request.getParameterNames();
//		while (enumeration.hasMoreElements()) {
//			String pName = enumeration.nextElement();
//			//getParameterValues可获取多个value值
//			if ("hobit".equals(pName)) {
//				String[] hobits = request.getParameterValues(pName);
//				for (String h : hobits) {
//					System.out.println(h + ",");
//				}
//			} else {
//				String pValue = request.getParameter(pName);
//				System.out.println(pName + "=" + pValue);
//			}
//		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post方式提交：");
		this.doGet(request, response);

	}
}
