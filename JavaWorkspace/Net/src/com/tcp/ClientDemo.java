package com.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * TCPЭ�鷢�����ݣ�
 * A:�������Ͷ˵�Socket����
 * 		��һ������ɹ�����˵�������Ѿ������ɹ��ˡ�
 * B:��ȡ�������д����
 * C:�ͷ���Դ
 * 
 * ���ӱ��ܾ���TCPЭ��һ��Ҫ�ȿ���������
 * java.net.ConnectException: Connection refused: connect
 */
public class ClientDemo {
	public static void main(String[] args)throws IOException {
		//�����ͻ���Socket����
		// �������Ͷ˵�Socket����
		// Socket(InetAddress address, int port)
		// Socket(String host, int port)
		// Socket s = new Socket(InetAddress.getByName("192.168.56.1"), 10086);
		Socket s=new Socket("192.168.56.1",10086);
		//�������������д����
		// public OutputStream getOutputStream()
		OutputStream os=s.getOutputStream();
		os.write("hello,tcp".getBytes());
		//�ͷ���Դ
		os.close();
	}
}
