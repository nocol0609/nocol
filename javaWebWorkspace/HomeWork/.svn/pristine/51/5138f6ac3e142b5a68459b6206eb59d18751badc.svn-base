package com.test_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 * 使用管道流和多线程完成以下任务

一个线程对象t1 会从控制台中不停的读取信息，读到之后把数据交给管道输出流,把数据写到管道里面
另一个线程对象t2 不停的使用管道输入流从管道里面读取数据，再把读到的数据写到一个文件里面
 */

//输出数据
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

// 获取数据
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
			
				// System.out.println("输入的信息为：" + new String(bys, 0, len));
				fos.write(bys, 0, len);
				System.out.println("请输入信息：");
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
		System.out.println("请输入信息：");
	}
}
