package com.tcp.imag_imag;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 将本地图片上传服务器，服务器再将图片写入本地图片
 */
public class UploadClient {
	public static void main(String[] args) throws IOException{
		//创建客户端Socket对象
		Socket s=new Socket("192.168.56.1",10086);
		//封装通道流
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		//封装数据源文件目录
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("touxiang.jpg"));
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys, 0, len);
			bos.flush();
		}
		//标记尾流
		s.shutdownOutput();
		
		//获取输入流读取反馈
		InputStream is=s.getInputStream();
		byte[] bys2=new byte[1024];
		int len2=0;
		while((len2=is.read(bys2))!=-1){
			System.out.println(new String(bys2,0,len2));
		}
		//释放资源
		bis.close();
		s.close();
	}
}
