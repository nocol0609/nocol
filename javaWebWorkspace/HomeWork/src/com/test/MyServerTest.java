package com.test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerTest {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("等待建立连接。。。");
		while (true) {
			Socket s = ss.accept();
			System.out.println("已有客户端连接");
			// 给用户返回数据
			OutputStream out = s.getOutputStream();
			PrintWriter pw = new PrintWriter(out, true);
			pw.println("helloworld");
			out.close();
		}
	}
}
