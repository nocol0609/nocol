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
 * UDPЭ��������ݣ�
 * A:�������ն�Socket����
 * B:����һ�����ݰ�(��������)
 * C:����Socket����Ľ��շ�����������
 * D:�������ݰ�������ʾ�ڿ���̨
 * E:�ͷ���Դ
 */
public class RecieveMessage {
	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		// DatagramSocket(int port)
		DatagramSocket ds=new DatagramSocket(4546); //���˿ں��Ա��������
		//����һ�����ݰ�(��������),���Լ������ռ�
		// DatagramPacket(byte[] buf, int length)
		byte[] bys=new byte[1024];
		int len=bys.length;
		DatagramPacket dp=new DatagramPacket(bys, len);
		//����Socket����Ľ��շ����������ݰ�
		// public void receive(DatagramPacket p)
		ds.receive(dp);
		//�������ݰ�
		// public byte[] getData():��ȡ���ݻ�����
		// public int getLength():��ȡ���ݵ�ʵ�ʳ���
		byte[] bys2=dp.getData();
		int length=bys2.length;
		String s=new String(bys2,0,length);
		// ��ȡ�Է���ip
		// public InetAddress getAddress()
		InetAddress address=dp.getAddress();
		String ip=address.getHostAddress();
		System.out.println(ip+"���͵�������"+s);
		//�ͷ���Դ
		ds.close();
	}
}
