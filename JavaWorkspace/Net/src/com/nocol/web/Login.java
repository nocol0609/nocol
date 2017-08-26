package com.nocol.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Login {

	private UserDao dao;
	private User user;
	private OutputStream out = null;
	private FileInputStream fis = null;

	// 登录逻辑
	public void LoginTest(Socket socket, String userName, String pwd) {

		dao = new UserDao();
		user = dao.findUserByNameAndPwd(userName, pwd);
		
		System.out.println("调用方法后查询得到的登录用户："+user);
		
		if (user != null) {// 说明用户存在,可以登录
			try {
				out = socket.getOutputStream();
				fis = new FileInputStream(new File("loginSuccess.html"));
				byte[] bs = new byte[1024];
				int len = 0;

				out.write("HTTP/1.1 200 OK\r\n".getBytes());
				out.write("\r\n".getBytes());

				while ((len = fis.read(bs)) != -1) {
					out.write(bs, 0, len);
					out.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					out.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {// 用户不存在前往注册
			try {
				out = socket.getOutputStream();
				fis = new FileInputStream(new File("loginFail.html"));
				byte[] bs = new byte[1024];
				int len = 0;

				out.write("HTTP/1.1 200 OK\r\n".getBytes());
				out.write("\r\n".getBytes());

				while ((len = fis.read(bs)) != -1) {
					out.write(bs, 0, len);
					out.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					out.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 显示登录页面
	public void DisplayLogin(Socket socket) {
		try {
			out = socket.getOutputStream();
			fis = new FileInputStream(new File("index.html"));
			byte[] bs = new byte[1024];
			int len = 0;

			out.write("HTTP/1.1 200 OK\r\n".getBytes());
			out.write("\r\n".getBytes());

			while ((len = fis.read(bs)) != -1) {
				out.write(bs, 0, len);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
