package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * UDPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 */
public class SendMessage {
	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket����
		DatagramSocket ds=new DatagramSocket();
		//�������ݣ��������ݴ��
		// DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		//��������
		byte[] bys="hello,Socket".getBytes();
		//����
		int len=bys.length;
		//IP��ַ����
		InetAddress address=InetAddress.getByName("192.168.56.1");
		//�����˿ں�
		int port=4546;
		//�������ݰ���������
		DatagramPacket dp=new DatagramPacket(bys, len, address, port); 
		//����Socket����ķ��͹���
		// public void send(DatagramPacket p)
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
	}
}
