package com.udp.threadchart;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class ReciveThread implements Runnable {

	private DatagramSocket ds;

	public ReciveThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// �������ݰ���������
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);
				// ����Socket�������
				ds.receive(dp);
				// �������� ��
				String ip = dp.getAddress().getHostAddress();
				String s = new String(dp.getData(), 0, dp.getData().length);
				System.out.println("From " + ip + " date is��" + s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
