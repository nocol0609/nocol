package com.nocol.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			String name=cookie.getName();
			String  value=cookie.getValue();
			System.out.println(name+"---"+value);
		}
		
		
//		String reqValue = (String) req.getAttribute("requestScope");
//		int sessionValue = (int) req.getSession().getAttribute("sessionScope");
//		boolean appValue = (boolean) req.getSession().getServletContext().getAttribute("apprecationScope");
//		
//		PrintWriter out = resp.getWriter();
//		out.println("<html><body>");
//		out.println("<h2>reqValue:"+reqValue+"</h2>");
//		out.println("<h2>sessionValue:"+sessionValue+"</h2>");
//		out.println("<h2>appValue:"+appValue+"</h2>");
//		out.println("</body></html>");
//		out.flush();
		
//		String name=req.getParameter("name");
//		System.out.println("targetServlet:"+name);
//		
//		PrintWriter out = resp.getWriter();
//		out.println("<html><body>");
//		out.println("<h2> targetServlet from sourseServlet</h2>");
//		out.println("</body></html>");
//		out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
