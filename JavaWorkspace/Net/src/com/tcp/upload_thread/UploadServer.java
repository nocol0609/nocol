package com.tcp.upload_thread;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class UploadServer {
	public static void main(String[] args) throws IOException {
		//����������Socket ����
		ServerSocket ss=new ServerSocket(4546);
		
		while(true){  //�����ϴ��߾����������CPU�����������ϴ��ļ�С���̻߳������õ�CPUִ��Ȩ��
			//�����ͻ�������
			Socket s=ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
