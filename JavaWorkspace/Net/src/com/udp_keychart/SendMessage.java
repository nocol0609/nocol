package com.udp_keychart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class SendMessage {
	public static void main(String[] args) throws IOException {
		// 创键Socket对象
		DatagramSocket ds = new DatagramSocket();
		// 封装键盘录入对象(自己定义的键盘输入流都需要自己包装)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = null;
//		Scanner sc=new Scanner(System.in);   //未解决
//		String line=sc.nextLine();
		while((line=br.readLine())!= null){
			if ("886".equals(line)) {  //如果输入886则退出
			break; 
			}
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.56.1"), 6768);
			// 调用Socket对象发送数据
			ds.send(dp);
		}
		// 释放资源
		ds.close();
	}
}
