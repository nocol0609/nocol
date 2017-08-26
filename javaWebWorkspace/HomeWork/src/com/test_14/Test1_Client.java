package com.test_14;

import java.io.InputStream;
import java.net.Socket;

public class Test1_Client {
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("127.0.0.1", 10000);
		InputStream is = socket.getInputStream();
		int len=0;
		byte[] bys=new byte[1024];
		while((len=is.read(bys))!=-1){
			System.out.println("客户端收到服务器信息："+new String(bys,0,len));
		}
		is.close();
	}
}
