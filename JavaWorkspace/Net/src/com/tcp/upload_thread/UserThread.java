package com.tcp.upload_thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * �κ��ϴ��Ŷ�����ִ�����´���
 */
public class UserThread implements Runnable {

	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// ��װͨ����
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// // ��װĿ���ļ�Ŀ¼
			// BufferedWriter bw = new BufferedWriter(new
			// FileWriter("copy2.txt"));
			
			// Ϊ�˷�ֹ���Ƴ�ͻ
			String newName = System.currentTimeMillis() + ".java";
			BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			// ��ȡ�������Ϊ�˸�������
			OutputStream os = s.getOutputStream();
			os.write("�ļ��ϴ��ɹ�".getBytes());
			// �ͷ���Դ
			bw.close();
			s.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
