package com.tcp.file_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class UploadServer {
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(4546);
		// 监听客户端连接
		Socket s = ss.accept();
		// 封装通道流
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		// 封装目的文件目录
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy2.txt"));
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
	}
}
