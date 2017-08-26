package com.test_14;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class MyHander extends Thread {

	private Socket socket;

	public MyHander(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("服务端已接收连接。");
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class Test2_Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(6768);
		System.out.println("等待客户端连接...");
		Socket s = ss.accept();
		if (s != null) {
			new MyHander(s).start();
		}

	}
}
