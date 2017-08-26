package com.nocol.basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("image/jpg");
		ServletOutputStream outputStream = response.getOutputStream();
		InputStream inputStream = this.getClass().getResourceAsStream("/b.jpg");
		System.out.println(inputStream);
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = inputStream.read(bys)) != -1) {
			outputStream.write(bys, 0, len);
			outputStream.flush();
			outputStream.close();
		}

		/*
		 * response.setContentType("text/xml;charset=utf-8"); PrintWriter out =
		 * response.getWriter(); out.println("<students>"); out.println(
		 * "<student id='1'>"); out.println("<name>tom</name><age>18</age>");
		 * out.println("</student>"); out.println("<student id='2'>");
		 * out.println("<name>jack</name><age>20</age>");
		 * out.println("</student>"); out.println("</students>");
		 * 
		 * out.flush(); out.close();
		 */
	}

}
