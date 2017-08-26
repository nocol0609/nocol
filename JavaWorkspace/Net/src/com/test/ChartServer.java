package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class HandlerSocket extends Thread {
	private Socket socket;

	public HandlerSocket(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		PrintWriter pw = null;
		Scanner sc = null;
		Scanner sc2 = null;

		try {
			pw = new PrintWriter(socket.getOutputStream());
			pw.println("客服" + getName() + "为您服务！");
			pw.flush();
			sc = new Scanner(System.in);

			sc2 = new Scanner(socket.getInputStream());
			while (true) {
				String msg = sc2.nextLine();
				System.out.println("Client say:" + msg);
				if ("byebye".equals(msg)) {
					break;
				}

				msg = sc.nextLine();
				pw.println(msg);
				pw.flush();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null)
				sc.close();
			if (pw != null)
				pw.close();
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}
}

public class ChartServer {
	static boolean flag = true;

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(8888);
			while (flag) {
				Socket socket = server.accept();
				// 分配一个线程处理客户端的请求。
				new HandlerSocket(socket).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null)
					server.close();
			} catch (Exception e2) {
			}
		}
	}
}
