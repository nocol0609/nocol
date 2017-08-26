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
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class SendMessage {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		DatagramSocket ds=new DatagramSocket();
		//创建数据，并把数据打包
		// DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		//创键数据
		byte[] bys="hello,Socket".getBytes();
		//长度
		int len=bys.length;
		//IP地址对象
		InetAddress address=InetAddress.getByName("192.168.56.1");
		//创键端口号
		int port=4546;
		//创键数据包发送数据
		DatagramPacket dp=new DatagramPacket(bys, len, address, port); 
		//调用Socket对象的发送功能
		// public void send(DatagramPacket p)
		ds.send(dp);
		//释放资源
		ds.close();
	}
}
