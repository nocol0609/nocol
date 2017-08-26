package com.nocol.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Image {
	public void DisplayImage(Socket socket) {
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("b.png"));
			out = socket.getOutputStream();
			bos = new BufferedOutputStream(out);

			//响应行 
			bos.write("HTTP/1.1 200 OK \r\n".getBytes());
			//响应头
			//bos.write("Content-Type: image/png \r\n".getBytes());
			//空行
			bos.write("\r\n".getBytes());

			int len = 0;
			byte[] bys = new byte[1024];
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
				bos.flush();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
