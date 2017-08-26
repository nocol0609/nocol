package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("即将进入等待状态...");
		Socket s = ss.accept();
		System.out.println("服务端已接收请求");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println("接收到的信息为：" + line);
			System.out.println("回复：");
		}
		
		// 封装输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String line1 = null;
				while ((line1 = br1.readLine()) != null) {
//					if ("886".equals(br1)) {
//						break;
//					}
					bw.write(line1);
					bw.newLine();
					bw.flush();
				}
			
		br1.close();
		bw.close();
	}
}
