package com.test;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChartClient {
	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = null;
		Scanner sc2 = null;
		try {
			socket = new Socket("127.0.0.1", 8888);

			sc = new Scanner(socket.getInputStream());

			System.out.println("׼����ȡ����˵���Ϣ������");

			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			sc2 = new Scanner(System.in);//��ȡ����̨���뷢�͸������

			while (true) {
				String msg = sc.nextLine();
				System.out.println("server say:" + sc.nextLine());
				if ("bye".equals(msg)) {
					break;
				}

				pw.write(sc2.nextLine());
				pw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				if (socket != null)
					socket.close();
			} catch (Exception e2) {
			}
		}
	}
}
