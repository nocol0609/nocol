package com.nocol.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nocol.param.User;

//@WebServlet(name = "Third", 
//			initParams = { 
//		@WebInitParam(name = "version", value = "1.0"),
//		@WebInitParam(name = "author", value = "tom"),	
//		},
//      loadOnStartup = 2
//)
@WebServlet("/Third")

public class ThirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("image/jpg;chrset=utf-8");

		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {

			File file = new File("I:\\javaWebWorkspace\\Servlet\\src\\b.jpg");
			// File file=new File("b.jpg");
			// System.out.println(file.getAbsolutePath());
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
			byte[] bys = new byte[1024];
			int len = 0;  
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
				bos.flush();
			}
			bos.close();
			bis.close();
		}else {
			resp.sendRedirect("/Servlet/login.html");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		this.doPost(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Enumeration<String> enumeration = config.getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + "---" + value);
		}
	}
}
