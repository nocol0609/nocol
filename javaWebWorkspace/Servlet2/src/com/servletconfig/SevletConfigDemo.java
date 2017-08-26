package com.servletconfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SevletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// private ServletConfig config;

	@Override
	// public void init(ServletConfig config) throws ServletException {
	// // TODO Auto-generated method stub
	// this.config = config;
	//
	// }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String path = config.getInitParameter("path");
		String path = this.getServletConfig().getInitParameter("path");
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		String len = null;
		while ((len = br.readLine()) != null) {
			System.out.println(len);
			
			
//		//查询Serrvlet的所有初始化数据
//			Enumeration<String> enums = ths.getServletConfig().getInitParameterNames();
//			while (enums.hasMoreElements()) {
//				String enumName = enums.nextElement();
//				String enumValue=this.getServletConfig().getInitParameter(enumName);
//				System.out.println(enumName+enumValue);
//			}
			
		//通过ServletConfig获取当前Serlet的名字
		String ServletNmae=this.getServletConfig().getServletName();
			System.out.println(ServletNmae);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
