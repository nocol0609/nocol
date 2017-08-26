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
 * 显示用户上次访问时间
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

		// 获取当前时间
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		String CurTime = format.format(new Date());
		String lastTime = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("lastTime")) {
					// 获取上次访问时间
					lastTime = c.getValue();
					// 显示
					response.getWriter().write("欢迎回来，上次访问时间是：" + lastTime + "当前时间为：" + CurTime);
					c.setValue(CurTime);
					response.addCookie(c);

					break;
				}
			}
		}
		if (cookies == null || lastTime == null) {
			// 显示当期那时间到流浪器
			response.getWriter().write("你是首次访问本网站，当前时间为：" + CurTime);
			// 创建Cookie对象保存本次访问时间
			Cookie cookie = new Cookie("lastTime", CurTime);
			// 发送Cookie到流浪器保存
			response.addCookie(cookie);
		}

	}

}
