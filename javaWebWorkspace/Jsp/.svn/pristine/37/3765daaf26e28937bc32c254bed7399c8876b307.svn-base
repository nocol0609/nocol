package com.nocol.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxTime")
public class AjaxTimeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String CurrDate = sdf.format(new Date());
		
		//以流的方式返回给ajax对象(不能使用转发否则还是全部刷新)
		PrintWriter pw = resp.getWriter();
		pw.write(CurrDate);
		pw.flush(); 
		pw.close();
	}
}
