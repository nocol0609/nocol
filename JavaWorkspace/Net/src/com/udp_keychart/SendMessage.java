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
		// ����Socket����
		DatagramSocket ds = new DatagramSocket();
		// ��װ����¼�����(�Լ�����ļ�������������Ҫ�Լ���װ)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = null;
//		Scanner sc=new Scanner(System.in);   //δ���
//		String line=sc.nextLine();
		while((line=br.readLine())!= null){
			if ("886".equals(line)) {  //�������886���˳�
			break; 
			}
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.56.1"), 6768);
			// ����Socket����������
			ds.send(dp);
		}
		// �ͷ���Դ
		ds.close();
	}
}
