package com.nocol.web;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8099);
		System.out.println("�ȴ��ͻ�������...");
		while (true) {
			Socket s = ss.accept();
			System.out.println("���пͻ������ӣ�");
			if (s != null) {
				new MyThreadHander(s).start();
			}
		}
	}
}
