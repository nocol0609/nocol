package com.java.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;


public class PictureClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.179.2", 11111);
		// 封装通道流
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		// 封装图片目录
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("a.png"));
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys, 0, len);
			bos.flush();
		}
		bis.close();
		s.close();
	}
}
