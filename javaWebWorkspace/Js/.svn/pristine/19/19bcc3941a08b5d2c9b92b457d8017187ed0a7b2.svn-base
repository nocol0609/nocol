package com.jquery.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jQyery_city")
public class Jquery_City extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/xml;charset=utf-8");// 通知ajax对象响应数据为xml格式
		String province = req.getParameter("province");
		System.out.println(province);
		PrintWriter pw = resp.getWriter();

		pw.write("<?xml version='1.0' encoding='UTF-8'?>");
		pw.write("<citys>");
		if ("江西".equals(province)) {
			pw.write("<city>南昌</city>");
			pw.write("<city>赣州</city>");
			pw.write("<city>上饶</city>");
			pw.write("<city>九江</city>");
		} else if ("江苏".equals(province)) {
			pw.write("<city>苏州</city>");
			pw.write("<city>南京</city>");
			pw.write("<city>昆山</city>");
		}

		pw.write("</citys>");
		pw.flush();
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
