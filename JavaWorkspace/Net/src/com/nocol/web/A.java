package com.nocol.web;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class A {
	public void TiaoZhuang(Socket socket) {
		OutputStream out;
		try {
			out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(out, true);
			pw.println("HTTP/1.1 200 OK ");
			pw.println("Content_Type: text/html ");
			pw.println("\r\n");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<a href='/text.action'>µã»÷Ìø×ª</a>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
