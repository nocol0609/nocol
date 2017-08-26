package com.java.test;

import java.net.ServerSocket;
import java.net.Socket;

public class PictureServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(11111);
		while (true) {
			Socket s = ss.accept();
			new Thread(new PictrureThread(s)).start();
		}
	}
}
