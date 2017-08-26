package com.nocol.param;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.setContentType("text/html;charset=utf-8");
		
		 //若前台乱码
         resp.setCharacterEncoding("utf-8");
		 String name = req.getParameter("username");
		 String pwd = req.getParameter("pwd");
		 String gender = req.getParameter("gender");
		 int age = Integer.parseInt(req.getParameter("age"));
		 String[] str = req.getParameterValues("hobby");
		 String hobby=str[0];
		 for (int i = 1; i < str.length; i++) {
		 hobby+=","+str[i];
		 }
		
		 System.out.println("name:" + name);
		 System.out.println("pwd:" + pwd);
		 System.out.println("gender:" + gender);
		 System.out.println("age:" + age);
		 System.out.println("hobby:" + hobby);
		
		// if ("abc".equals(name) && "123".equals(pwd)) {
		// resp.getOutputStream().write("登录成功".getBytes());
		//
		// } else {
		// resp.getOutputStream().write("登录失败".getBytes());
		// }
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 若前台乱码
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

//		Enumeration<String> enumeration = req.getParameterNames();
//		while (enumeration.hasMoreElements()) {
//			String string = enumeration.nextElement();
//			System.out.println(string);
//		}

		/*
		 * Map<String, String[]> map = req.getParameterMap();
		 *  Set set=map.entrySet(); 
		 *  for (Object object : set) {
		 * 		System.out.println(object); 
		 * } 
		 * Set<String> set=map.keySet(); 
		 * for(String s : set) { 
		 * String[] value=map.get(s);
		 * System.out.println(value);
		 * }
		 */
        
		 String name = req.getParameter("username");
		 String pwd = req.getParameter("pwd");
		 String gender = req.getParameter("gender");
		 int age = Integer.parseInt(req.getParameter("age"));
		 String[] str = req.getParameterValues("hobby");
		 String hobby=str[0];
		 for (int i = 1; i < str.length; i++) {  
		 hobby+=","+str[i];
		 }
		
		 User user=new User(name,pwd,gender,age,hobby);
		 //判断User是否存在
		 UserDao dao=new UserDaoImpl();
		 User u = dao.findUserByName(name);
		// ServletOutputStream out1 = resp.getOutputStream();
		 PrintWriter out = resp.getWriter();
		 if(u==null){
			 dao.saveUser(user);
			 
			 //重定向的绝对路径：Tomcat的根路径
			 //重定向的相对路径：相对于当前路径
//			 resp.sendRedirect("/Servlet/login.html");
			 
//			// out1.write("登录成功".getBytes());
//			 out.println("<html><head><title>登录页面</title></head>");
//			 out.println("<body><h1>登录成功</h1></body></html>");
			 
//			 //跳转路径："/"表示当前web项目下
//			 req.getRequestDispatcher("/login.html").forward(req, resp);
			 req.getSession().getServletContext().getRequestDispatcher("/login.html").forward(req, resp);
			 
			 
		 }else {
			//out1.write("该用户已存在".getBytes());
//			out.println("<html><head><title>注册</title></head>");
//			 out.println("<body><h1>该用户已存在</h1></body></html>");
			 
//			 req.getRequestDispatcher("regist.html").forward(req, resp);
			 req.getSession().getServletContext().getRequestDispatcher("/regist.html").forward(req, resp);
//			 resp.sendRedirect("../regist.html");
		}
		 
//		 System.out.println(user);
//		 System.out.println("name:" + name);
//		 System.out.println("pwd:" + pwd);
//		 System.out.println("gender:" + gender);
//		 System.out.println("age:" + age);
//		 System.out.println("hobby:" + hobby);

	}
}
