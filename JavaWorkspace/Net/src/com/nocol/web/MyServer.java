package com.nocol.web;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8099);
		System.out.println("等待客户端连接...");
		while (true) {
			Socket s = ss.accept();
			System.out.println("已有客户端连接！");
			if (s != null) {
				new MyThreadHander(s).start();
			}
		}
	}
}
