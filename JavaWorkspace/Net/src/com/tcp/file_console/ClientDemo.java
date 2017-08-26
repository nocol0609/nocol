package com.tcp.file_console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class ClientDemo {
	public static void main(String[] args)throws IOException {
		//创建客户端Sokect对象
		Socket s=new Socket("192.168.56.1", 6768); 
		//封装通道流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//封装文本目录
		BufferedReader br=new BufferedReader(new FileReader("JDBCTemplate.java")); 
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		br.close();
		s.close();
	}
}
