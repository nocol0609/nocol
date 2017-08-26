package com.tcp.imag_imag;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class UploadServer {
	public static void main(String[] args)throws IOException {
		//创建服务器Socket对象
		ServerSocket ss=new ServerSocket(10086); 
		//监听客户端连接
		Socket s=ss.accept();
		//封装通道流
		BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
		//封装目标文件目录
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("bizhi.jpg"));
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
		bos.write(bys,0,len);
			bos.flush();
		}
		//获取输出流以给出反馈
		OutputStream os=s.getOutputStream();
		os.write("图片上传成功".getBytes());
		
		//释放资源
		bos.close();
		s.close();
	}
}
