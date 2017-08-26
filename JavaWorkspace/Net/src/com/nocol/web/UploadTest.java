package com.nocol.web;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;

public class UploadTest {
	
	public void FileResponse(Socket socket, File file) {

		// 随机访问流
		RandomAccessFile raf = null;
		RandomAccessFile out = null;
		try {
			raf = new RandomAccessFile(file, "r");
			String abc = "";
			for (int i = 0; i < 13; i++) {
				String data = raf.readLine();
				if (i == 12) {
					abc = data;
				}
				// System.out.println(abc);
			}
			// name="filename"; filename="Penguins.jpg"
			String fileName = abc.substring(abc.lastIndexOf("=\"") + 2, abc.lastIndexOf("\""));
			fileName = new String(fileName.getBytes("GBK"), "utf-8");
			// fileName = new String(fileName.getBytes("GBK"), "utf-8");
			System.out.println(fileName);// 文件名获取

			raf.seek(0);
			long startPoint = 0;// 开始位置

			int i = 1;// 定多少行
			int data = 0;
			while ((data = raf.readByte()) != -1 && i <= 15) {
				if (data == '\n') {
					startPoint = raf.getFilePointer();
					i++;
				}
			}
			startPoint = raf.getFilePointer() - 1;
			System.out.println("开始位置" + startPoint);

			// 结束位置
			raf.seek(file.length());
			long endPoint = raf.getFilePointer();// 记录文件尾位置

			int n = 1;
			// 1231231231
			while (endPoint >= 0 && n <= 2) {
				endPoint--;
				raf.seek(endPoint);
				if (raf.readByte() == '\n') {
					n++;
				}
			}
			endPoint--;
			System.out.println("结束位置：" + endPoint);

			// 从开始位置到结束位置 把数据 输出到 系统

			File file1 = new File("i://MyDownLoad");
			// 确保文件夹存在
			if (!file1.exists()) {
				file1.mkdirs();
			}

			out = new RandomAccessFile(new File(file1 + "/" + fileName), "rw");

			raf.seek(startPoint);// 把文件输入流 定位到 数据开始的位置

			while (startPoint < endPoint) {

				int read = raf.read();
				out.write(read);
				startPoint = raf.getFilePointer();
			}
			System.out.println("....完成....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				raf.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
