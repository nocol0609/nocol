package com.nocol.web;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Text {
	public void PrintText(Socket socket) {
		BufferedReader br = null;
		OutputStream out = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("a.txt"));
			out = socket.getOutputStream();
			pw = new PrintWriter(out, true);
			String line = null;
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
