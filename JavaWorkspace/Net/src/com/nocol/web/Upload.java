package com.nocol.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.UUID;

public class Upload {
	public void UploadFile(Socket socket) {
		OutputStream out = null;
		FileInputStream fis = null;
		try {
			out = socket.getOutputStream();
			fis = new FileInputStream(new File("upload.html"));
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
				fis.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}