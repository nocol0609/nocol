package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpMsg {
	public static void main(String[] args)throws Exception {
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("等待连接..");
		Socket s = ss.accept();
		System.out.println("已连接"+s);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
}
