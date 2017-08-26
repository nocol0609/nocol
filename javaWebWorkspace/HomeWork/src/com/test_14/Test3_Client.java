package com.test_14;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Test3_Client {
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("127.0.0.1", 8888);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("服务器你好");
		bw.newLine();
		bw.flush();
		//结束标志
		socket.shutdownOutput();
		
		//获取输入流读取反馈
		InputStream is = socket.getInputStream();
		int len=0;
		byte[] bys=new byte[1024];
		while((len=is.read(bys))!=-1){
			System.out.println("接收服务器反馈："+new String(bys,0,len));
		}
		
		is.close();
	} 
}
