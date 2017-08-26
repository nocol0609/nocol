package com.test_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Test2_Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 6768);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println("接收到服务端消息：" + line);
		}

		br.close();
		socket.close();
	}
}
