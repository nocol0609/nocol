package com.tcp_keychart;

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
	public static void main(String[] args) throws IOException{
		//创键客户端Socket对象
		ServerSocket ss=new ServerSocket(6768);
		//监听客户端连接
		Socket s=ss.accept();
		//获取输入流(读字符需要包装通道内的流)
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String server=null;
		while((server=br.readLine())!=null){
			System.out.println("server:"+server);
		}
		s.close();
	}
}
