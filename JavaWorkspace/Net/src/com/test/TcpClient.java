package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 10000);
		// 分装通道流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		// 封装输入流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(br)) {
				break;
			}

			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line1 = null;
		while ((line1 = br1.readLine()) != null) {
			System.out.println("客户端接收到的信息为：" + line1);
		}
		
		socket.close();
		br.close();
		bw.close();
		br1.close();
	}
}
