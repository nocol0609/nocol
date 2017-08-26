package com.tcp.upload_thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 多人上传文件，用线程改进，资源优先者可以先抢到资源，不会造成阻塞
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket对象
		Socket s=new Socket("192.168.56.1", 4546); 
		//封装通道流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//封装数据源文件目录
		BufferedReader br=new BufferedReader(new FileReader("JDBCTemplate.java"));
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//结束标志
		s.shutdownOutput();
		//获取读取反馈的输入流
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len=0;
		while((len=is.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}
		//释放资源
		br.close();
		s.close();
	}
}
