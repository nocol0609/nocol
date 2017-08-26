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

	// ��¼�߼�
	public void LoginTest(Socket socket, String userName, String pwd) {

		dao = new UserDao();
		user = dao.findUserByNameAndPwd(userName, pwd);
		
		System.out.println("���÷������ѯ�õ��ĵ�¼�û���"+user);
		
		if (user != null) {// ˵���û�����,���Ե�¼
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
		} else {// �û�������ǰ��ע��
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

	// ��ʾ��¼ҳ��
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
