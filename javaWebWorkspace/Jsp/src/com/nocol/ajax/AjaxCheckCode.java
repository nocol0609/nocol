package com.nocol.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/code")
public class AjaxCheckCode extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = req.getParameter("checkCode");
		// ��session�л�ȡ��֤��
		HttpSession session = req.getSession();
		String checkCode = (String) session.getAttribute("CHECKNUM");
		String tip = "images/MsgError.gif";
		if (checkCode.equals(code)) {
			tip = "images/MsgSent.gif";
		}

		// �����ķ�ʽ��Ӧ��ajax����
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		pw.write(tip);
		pw.flush();
		pw.close();
	}
}
