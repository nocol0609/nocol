package com.nocol.web;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class HelloWorld {

	public void PrintHelloWorld(Socket socket) {
		OutputStream out = null;
		try {
			
			out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(out, true);
			pw.println("helloworld");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
