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
		//�����ͻ���Sokect����
		Socket s=new Socket("192.168.56.1", 6768); 
		//��װͨ����
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//��װ�ı�Ŀ¼
		BufferedReader br=new BufferedReader(new FileReader("JDBCTemplate.java")); 
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		br.close();
		s.close();
	}
}
