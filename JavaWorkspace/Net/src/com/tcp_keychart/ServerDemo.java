package com.tcp_keychart;

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
	public static void main(String[] args) throws IOException{
		//�����ͻ���Socket����
		ServerSocket ss=new ServerSocket(6768);
		//�����ͻ�������
		Socket s=ss.accept();
		//��ȡ������(���ַ���Ҫ��װͨ���ڵ���)
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String server=null;
		while((server=br.readLine())!=null){
			System.out.println("server:"+server);
		}
		s.close();
	}
}
