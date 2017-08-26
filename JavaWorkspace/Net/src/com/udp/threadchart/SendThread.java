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
				// ������
				byte[] bys = line.getBytes();
				// �������ݰ�
				DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.179.2"), 10086);
				// ����Socket���������ݰ�
				ds.send(dp);
			}
			// �ͷ���Դ
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
