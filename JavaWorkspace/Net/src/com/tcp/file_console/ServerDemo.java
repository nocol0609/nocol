package com.tcp.file_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class ServerDemo {
	public static void main(String[] args)throws IOException {
		//创建服务器Socket对象
		ServerSocket ss=new ServerSocket(6768);  
		//监听客户端连接
		Socket s=ss.accept();
		//封装通道流
		BufferedReader br=new BufferedReader( new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
}
