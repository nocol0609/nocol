package com.nocol.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SourseServlet")
public class SourseServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
//		String name=req.getParameter("name");
//		System.out.println("sorseSerlet:"+name);
//		
//		PrintWriter out = resp.getWriter();
//		out.println("<html><body>");
//		out.println("<h2>sourseServlet to targetServlet</h2>");
//		out.println("</body></html>";
//		req.getRequestDispatcher("/TargetServlet").include(req, resp);
		
//		req.setAttribute("requestScope", "request"); 
//		HttpSession session = req.getSession();
//		session.setAttribute("sessionScope", 10);
//		ServletContext context = req.getSession().getServletContext();
//		context.setAttribute("apprecationScope", true);
		
		Cookie c1 = new Cookie("name", "tom");
		Cookie c2 = new Cookie("pwd", "123");
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		//外部跳转sendRedirect()中"/"代表Tomcat的根路径
		resp.sendRedirect("/Servlet/TargetServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
