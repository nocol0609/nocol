package com.udp.threadchart;

import java.io.IOException;
import java.net.DatagramSocket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class ChartRoom {
	public static void main(String[] args) throws IOException{
		//�ֱ𴴼����ͺͽ��յ�socket����
		DatagramSocket dsSend=new DatagramSocket();
		DatagramSocket dsRrecive=new DatagramSocket(10086);
		
		//�������ͺͽ��յ���Դ���󣬲��Ѹ��Ե�Socket���󴫹�ȥ
		SendThread st=new SendThread(dsSend);
		ReciveThread rt=new ReciveThread(dsRrecive);
		
		//�������ͺͽ��յ��߳�
		Thread t1=new Thread(st);
		Thread t2=new Thread(rt);
		
		//�����߳�
		t1.start();
		t2.start();
	}
}
