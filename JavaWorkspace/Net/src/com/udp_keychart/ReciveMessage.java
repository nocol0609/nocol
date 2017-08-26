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
		//创键Socket对象
		DatagramSocket ds=new DatagramSocket(6768); 
		//创键数据包接收
		while(true){
			byte[] bys=new byte[1024];
			DatagramPacket dp=new DatagramPacket(bys, bys.length);//数据包长度
			//接收数据包
			ds.receive(dp);
			//解析数据包
			String ip=dp.getAddress().getHostAddress();
			String s=new String(dp.getData(), 0, dp.getData().length);//实际长度
			System.out.println("from "+ip+" date is："+s);
		}
		// 释放资源
		//不需要释放资源，因为接收端口需要一直开着等待接收，由发送方控制结束
		//ds.close();
	}
}
