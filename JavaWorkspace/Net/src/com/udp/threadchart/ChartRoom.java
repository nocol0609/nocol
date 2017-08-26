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
		//分别创键发送和接收的socket对象
		DatagramSocket dsSend=new DatagramSocket();
		DatagramSocket dsRrecive=new DatagramSocket(10086);
		
		//创键发送和接收的资源对象，并把各自的Socket对象传过去
		SendThread st=new SendThread(dsSend);
		ReciveThread rt=new ReciveThread(dsRrecive);
		
		//创键发送和接收的线程
		Thread t1=new Thread(st);
		Thread t2=new Thread(rt);
		
		//启动线程
		t1.start();
		t2.start();
	}
}
