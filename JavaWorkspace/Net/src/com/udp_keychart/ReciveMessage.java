package com.udp_keychart;

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
public class ReciveMessage {
	public static void main(String[] args) throws IOException {
		//����Socket����
		DatagramSocket ds=new DatagramSocket(6768); 
		//�������ݰ�����
		while(true){
			byte[] bys=new byte[1024];
			DatagramPacket dp=new DatagramPacket(bys, bys.length);//���ݰ�����
			//�������ݰ�
			ds.receive(dp);
			//�������ݰ�
			String ip=dp.getAddress().getHostAddress();
			String s=new String(dp.getData(), 0, dp.getData().length);//ʵ�ʳ���
			System.out.println("from "+ip+" date is��"+s);
		}
		// �ͷ���Դ
		//����Ҫ�ͷ���Դ����Ϊ���ն˿���Ҫһֱ���ŵȴ����գ��ɷ��ͷ����ƽ���
		//ds.close();
	}
}
