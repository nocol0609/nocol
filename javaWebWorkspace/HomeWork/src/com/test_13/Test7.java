package com.test_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 * ʹ�ùܵ����Ͷ��߳������������

һ���̶߳���t1 ��ӿ���̨�в�ͣ�Ķ�ȡ��Ϣ������֮������ݽ����ܵ������,������д���ܵ�����
��һ���̶߳���t2 ��ͣ��ʹ�ùܵ��������ӹܵ������ȡ���ݣ��ٰѶ���������д��һ���ļ�����
 */

//�������
class SetDate extends Thread {

	private PipedOutputStream pos;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public SetDate(PipedOutputStream pos) {
		// TODO Auto-generated constructor stub
		this.pos = pos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				byte[] line = br.readLine().getBytes();
				pos.write(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// ��ȡ����
class GetDate extends Thread {
	private PipedInputStream pis;

	public GetDate(PipedInputStream pis) {
		// TODO Auto-generated constructor stub
		this.pis = pis;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream("out.txt", true);
			int len = 0;
			byte[] bys = new byte[1024];
			while ((len = pis.read(bys)) != -1) {
			
				// System.out.println("�������ϢΪ��" + new String(bys, 0, len));
				fos.write(bys, 0, len);
				System.out.println("��������Ϣ��");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test7 {
	public static void main(String[] args) throws Exception {

		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream(pis);

		SetDate set = new SetDate(pos);
		GetDate get = new GetDate(pis);

		set.start();
		get.start();
		System.out.println("��������Ϣ��");
	}
}
