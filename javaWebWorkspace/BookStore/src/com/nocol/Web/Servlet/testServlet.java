package com.nocol.Web.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String price=req.getParameter("price");
		String num=req.getParameter("num");
		
		Double price1 = Double.valueOf(price);
		Integer number = Integer.valueOf(num);
		
		Double money=price1*number;
		
		PrintWriter out = resp.getWriter();
		out.write(String.valueOf(money));
	}
}

