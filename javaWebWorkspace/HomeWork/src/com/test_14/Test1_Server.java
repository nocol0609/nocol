package com.test_14;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(10000);
		System.out.println("等待客户端连接...");
		Socket s = ss.accept();
		System.out.println("客户端已连接");
		OutputStream os = s.getOutputStream();
		os.write("hello world".getBytes());
	}
}
