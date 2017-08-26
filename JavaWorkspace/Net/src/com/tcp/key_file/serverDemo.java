package com.tcp.key_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class serverDemo {
	public static void main(String[] args)throws IOException {
		//创建服务器Socket对象
		ServerSocket ss=new ServerSocket(4546);
		//监听客户端连接
		Socket s=ss.accept();
		//封装通道流
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//封装文本数据目录
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
		
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();
		s.close();
	}
}
