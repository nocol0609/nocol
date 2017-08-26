package com.nocol.cookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ʾ�û��ϴη���ʱ��
 * @author Nocol
 *
 */

public class HisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HisServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		// ��ȡ��ǰʱ��
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		String CurTime = format.format(new Date());
		String lastTime = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("lastTime")) {
					// ��ȡ�ϴη���ʱ��
					lastTime = c.getValue();
					// ��ʾ
					response.getWriter().write("��ӭ�������ϴη���ʱ���ǣ�" + lastTime + "��ǰʱ��Ϊ��" + CurTime);
					c.setValue(CurTime);
					response.addCookie(c);

					break;
				}
			}
		}
		if (cookies == null || lastTime == null) {
			// ��ʾ������ʱ�䵽������
			response.getWriter().write("�����״η��ʱ���վ����ǰʱ��Ϊ��" + CurTime);
			// ����Cookie���󱣴汾�η���ʱ��
			Cookie cookie = new Cookie("lastTime", CurTime);
			// ����Cookie������������
			response.addCookie(cookie);
		}

	}

}
