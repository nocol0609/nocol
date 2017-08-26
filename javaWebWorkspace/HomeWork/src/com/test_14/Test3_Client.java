package com.test_14;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Test3_Client {
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("127.0.0.1", 8888);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("���������");
		bw.newLine();
		bw.flush();
		//������־
		socket.shutdownOutput();
		
		//��ȡ��������ȡ����
		InputStream is = socket.getInputStream();
		int len=0;
		byte[] bys=new byte[1024];
		while((len=is.read(bys))!=-1){
			System.out.println("���շ�����������"+new String(bys,0,len));
		}
		
		is.close();
	} 
}
