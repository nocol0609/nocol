package com.nocol.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxUser")
public class AjaxUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		resp.setContentType("text/xml;charset=utf-8");
//		req.setCharacterEncoding("utf-8");
//		resp.setCharacterEncoding("utf-8");
		String name = req.getParameter("userName");
		byte[] bytes = name.getBytes("ISO8859-1");
		name = new String(bytes,"utf-8");
		String tip=null;
		if("杰克".equals(name)){
			tip="该用户已存在";
		}else {
			tip="该用户名可用";
		}
		
		resp.setContentType("text/html;charset=utf-8");
		//以流的方式响应给ajax对象
		PrintWriter pw = resp.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("userName");
		System.out.println(name);
		String tip = "images/MsgSent.gif";
		if("杰克".equals(name)){
			tip = "images/MsgError.gif";
		}
		
		resp.setContentType("text/html;charset=utf-8");
		//以流的方式响应给ajax对象
		PrintWriter pw = resp.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
		
	}
}
