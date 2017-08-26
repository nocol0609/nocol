package com.nocol.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMy {
	public static void main(String[] args)throws Exception {

		ServerSocket s = new ServerSocket(8099);
		System.out.println("...");
		//浏览器地址栏输入 localhsot:8099
		Socket socket = s.accept();
		//获得输入流
		InputStream in = socket.getInputStream();

		byte[] but  =new byte[1024];
		File file = new File("src/abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		boolean flag = true;
		while(flag){
			int len = in.read(but);
			fos.write(but,0,len);
			fos.flush();
			System.out.println(len);
			if(len<800){
				flag = false;
			}
		}
		
		fos.close();
		//in.close();
		System.out.println("完成");
		
		
		
	}
}
