package com.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			byte[] bys = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bys, bys.length);
			// 接收数包
			ds.receive(packet);
			
			byte[] bys2 = packet.getData();
			String msg = new String(bys2, 0, bys2.length);
			System.out.println("Client say:" + msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
