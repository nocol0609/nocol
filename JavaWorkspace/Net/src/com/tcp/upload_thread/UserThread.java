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
 * 任何上传着都必须执行以下代码
 */
public class UserThread implements Runnable {

	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 封装通道流
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// // 封装目的文件目录
			// BufferedWriter bw = new BufferedWriter(new
			// FileWriter("copy2.txt"));
			
			// 为了防止名称冲突
			String newName = System.currentTimeMillis() + ".java";
			BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			// 获取输出流（为了给反馈）
			OutputStream os = s.getOutputStream();
			os.write("文件上传成功".getBytes());
			// 释放资源
			bw.close();
			s.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
