package com.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			byte[] bys = "hello".getBytes();

			DatagramPacket packet = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 9999);
			ds.send(packet);
			ds.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
