package com.tcp.file_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class ServerDemo {
	public static void main(String[] args)throws IOException {
		//����������Socket����
		ServerSocket ss=new ServerSocket(6768);  
		//�����ͻ�������
		Socket s=ss.accept();
		//��װͨ����
		BufferedReader br=new BufferedReader( new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
}
