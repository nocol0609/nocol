package com.udp.threadchart;

import java.io.BufferedReader;
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
public class SendThread implements Runnable {

	private DatagramSocket ds;

	public SendThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while ((line=br.readLine())!= null) {
				if ("886".equals(line)) {
					break;
				}
				// 键数据
				byte[] bys = line.getBytes();
				// 创键数据包
				DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.179.2"), 10086);
				// 调用Socket对象发送数据包
				ds.send(dp);
			}
			// 释放资源
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
