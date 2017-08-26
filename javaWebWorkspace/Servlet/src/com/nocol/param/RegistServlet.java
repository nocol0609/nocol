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
		
		 //��ǰ̨����
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
		// resp.getOutputStream().write("��¼�ɹ�".getBytes());
		//
		// } else {
		// resp.getOutputStream().write("��¼ʧ��".getBytes());
		// }
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// ��ǰ̨����
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
		 //�ж�User�Ƿ����
		 UserDao dao=new UserDaoImpl();
		 User u = dao.findUserByName(name);
		// ServletOutputStream out1 = resp.getOutputStream();
		 PrintWriter out = resp.getWriter();
		 if(u==null){
			 dao.saveUser(user);
			 
			 //�ض���ľ���·����Tomcat�ĸ�·��
			 //�ض�������·��������ڵ�ǰ·��
//			 resp.sendRedirect("/Servlet/login.html");
			 
//			// out1.write("��¼�ɹ�".getBytes());
//			 out.println("<html><head><title>��¼ҳ��</title></head>");
//			 out.println("<body><h1>��¼�ɹ�</h1></body></html>");
			 
//			 //��ת·����"/"��ʾ��ǰweb��Ŀ��
//			 req.getRequestDispatcher("/login.html").forward(req, resp);
			 req.getSession().getServletContext().getRequestDispatcher("/login.html").forward(req, resp);
			 
			 
		 }else {
			//out1.write("���û��Ѵ���".getBytes());
//			out.println("<html><head><title>ע��</title></head>");
//			 out.println("<body><h1>���û��Ѵ���</h1></body></html>");
			 
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
