package com.nocol.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class DownLoad {

	private OutputStream out = null;
	private FileInputStream fis = null;

	// 显示下载页面
	public void DisplayDownload(Socket socket) {

		try {
			out = socket.getOutputStream();
			fis = new FileInputStream(new File("downLoad.html"));
			byte[] bs = new byte[1024];
			int len = 0;

			out.write("HTTP/1.1 200 OK\r\n".getBytes());
			out.write("\r\n".getBytes());

			while ((len = fis.read(bs)) != -1) {
				out.write(bs, 0, len);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 实现下载逻辑
	public void DownLoadTest(Socket socket, String fileName) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			File file = new File("i://MyDownLoad");
			// 确保文件夹存在
			if (!file.exists()) {
				file.mkdirs();
			}
			bis = new BufferedInputStream(new FileInputStream(fileName));
			bos = new BufferedOutputStream(new FileOutputStream(file + "/" + fileName));
			int len = 0;
			byte[] bys = new byte[2048];
			try {
				while ((len = bis.read(bys)) != -1) {
					bos.write(bys, 0, len);
					bos.flush();
					
//					if (fileName.length() == 10279840) {
//						
//						System.out.println("====================进入判断=================");
//						// 显示下载完成
//						DownLoadSuccess(socket);
//					}
				}
				System.out.println("====================下载完成=================");
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 显示下载完成
	public void DownLoadSuccess(Socket socket) {
		try {
			out = socket.getOutputStream();
			fis = new FileInputStream(new File("DownLoadSuccess.html"));
			byte[] bs = new byte[1024];
			int len2 = 0;

			out.write("HTTP/1.1 200 OK\r\n".getBytes());
			out.write("\r\n".getBytes());

			while ((len2 = fis.read(bs)) != -1) {
				out.write(bs, 0, len2);
				out.flush();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				fis.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
