package com.test_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.Socket;

public class PictrureThread implements Runnable {

	private Socket s;

	public PictrureThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 封装通道流
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			// 封装文件输出目录
			String name = System.currentTimeMillis() + "aa.png";
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
				bos.flush();
			}
			bos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
