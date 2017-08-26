package com.tcp.file_file;

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
 * 本地文件上传至服务器，服务器再将该文件输入另一文件，并给出反馈
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
