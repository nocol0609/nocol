package com.jquery.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jqueryUser")
public class Jquery_User extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		System.out.println(name + "---" + pwd);
		String tip = "MsgSent.gif";
		if ("杰克".equals(name) && "123".equals(pwd)) {
			tip = "MsgError.gif";
		}
		
		resp.setContentType("text/html;charset=utf-8");
		// 以流的方式响应给ajax对象
		PrintWriter pw = resp.getWriter();
		pw.write(tip);
		pw.flush();
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
