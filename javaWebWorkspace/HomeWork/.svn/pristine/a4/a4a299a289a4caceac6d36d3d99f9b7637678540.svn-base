package com.test_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3_Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(8888);
		Socket s = ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println("收到客户端信息："+line);
		}
		
		//获取输出流反馈
		OutputStream os = s.getOutputStream();
		os.write("服务器已接收到信息。".getBytes());
		
		br.close();
		os.close();
	}
}
