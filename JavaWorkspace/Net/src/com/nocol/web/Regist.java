package com.nocol.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Regist {

	private OutputStream out = null;
	private FileInputStream fis = null;
	private UserDao dao;
	private User user;
	// 显示注册页面
	public void DisplayRegist(Socket socket) {

		try {
			out = socket.getOutputStream();
			fis = new FileInputStream(new File("regist.html"));
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

	// 实现注册逻辑
	public void RegistTest(Socket socket, String userName, String pwd) {
				
     	dao = new UserDao();
		user = dao.findUserByName(userName);
		
		System.out.println("根据姓名查询后用户：" + user);
		
		User newUser = new User();
		if (user == null) {// 该用户名不存在，可以注册
			newUser.setName(userName);
			newUser.setPwd(pwd);
			
			System.out.println("注册用户："+newUser);	
			//添加用户
			dao.addUser(newUser);
			
			System.out.println("注册后显示所有用户："+dao.findAllUser());
			
			try {
				out = socket.getOutputStream();
				fis = new FileInputStream(new File("RegistSuccess.html"));
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
		} else {// 该用户已存在
			try {
				out = socket.getOutputStream();
				fis = new FileInputStream(new File("RegistFail.html"));
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

}
