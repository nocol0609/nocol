package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * TCPЭ��������ݣ�
 * A:�������ն˵�Socket����
 * B:�����ͻ������ӡ�����һ����Ӧ��Socket����
 * C:��ȡ����������ȡ������ʾ�ڿ���̨
 * D:�ͷ���Դ
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException{
		//����������Socket����
		// ServerSocket(int port)
		ServerSocket ss=new ServerSocket(10086);
		//�����ͻ���,������һ����Ӧ��Socket����
		// public Socket accept()
		Socket s=ss.accept();//���������ܵ����׽��ֵ����ӡ��˷��������Ӵ���֮ǰһֱ������
		//��������������
		InputStream is=s.getInputStream();
		//��ȡip
		String ip=s.getInetAddress().getHostAddress();
		//������
		byte[] bys=new byte[1024];
		int line=is.read(bys);// ����ʽ����
		String str=new String(bys, 0, line);
		System.out.println(ip +":"+ str);
		
		//�ͷ���Դ��ע���ͷŵ���Socket����s��������Socket����ss����Ҫ�ر�
		s.close();
	}
}
