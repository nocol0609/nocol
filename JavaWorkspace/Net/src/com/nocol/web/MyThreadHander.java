package com.nocol.web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Properties;

public class MyThreadHander extends Thread {

	private Socket socket;

	public MyThreadHander(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String line = null;

		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			line = br.readLine();// GET /text.action HTTP/1.1
			System.out.println(line);
			// 获取url
			String[] str = line.split(" ");
			String action = str[1].substring(1);
			System.out.println(action);
			// 加载配置文件
			Properties pro = new Properties();
			pro.load(new FileInputStream("mapper.properties"));
			String className = pro.getProperty(action);
			System.out.println(className);

			if ("text.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("PrintHelloWorld", Socket.class);
				m.invoke(obj, socket);
			} else if ("a.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("TiaoZhuang", Socket.class);
				m.invoke(obj, socket);
			} else if ("textFile.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("PrintText", Socket.class);
				m.invoke(obj, socket);
			} else if ("image.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("DisplayImage", Socket.class);
				m.invoke(obj, socket);
			} else if ("imageIma.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("PrintHtmlImage", Socket.class);
				m.invoke(obj, socket);
			} else if ("index.html".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("DisplayHtml", Socket.class);
				m.invoke(obj, socket);
			} else if ("regist.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("DisplayRegist", Socket.class);
				m.invoke(obj, socket);
			} else if ("login.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("DisplayLogin", Socket.class);
				m.invoke(obj, socket);
			} else if ("upload.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("UploadFile", Socket.class);
				m.invoke(obj, socket);
			} else if ("uploadTest.action".equals(action)) {

				System.out.println("===================================");
				File file = new File("abc.txt");
				bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
				while ((line = br.readLine()) != null) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
					bw.flush();

					Class<?> c = Class.forName(className);
					Object obj = c.getConstructor().newInstance();
					Method m = c.getMethod("FileResponse", Socket.class, File.class);
					m.invoke(obj, socket, file);
				}
				br.close();
			} else if ("download.action".equals(action)) {
				Class<?> c = Class.forName(className);
				Object obj = c.getConstructor().newInstance();
				Method m = c.getMethod("DisplayDownload", Socket.class);
				m.invoke(obj, socket);
			} else {
				if (action.indexOf("&") != -1) {
					String[] str2 = action.split("[?]");
					String action2 = str2[0];
					String[] str3 = str2[1].split("=");
					String pwd = str3[2];
					System.out.println("pwd:" + pwd);
					String[] str4 = str3[1].split("&");
					String userName = str4[0];
					System.out.println("userName:" + userName);
					if ("login.action".equals(action2)) {
						className = pro.getProperty(action2);
						System.out.println(className);
						Class<?> c = Class.forName(className);
						Object obj = c.getConstructor().newInstance();
						Method m = c.getMethod("LoginTest", Socket.class, String.class, String.class);
						m.invoke(obj, socket, userName, pwd);
					} else if ("regist.action".equals(action2)) {
						className = pro.getProperty(action2);
						Class<?> c = Class.forName(className);
						Object obj = c.getConstructor().newInstance();
						Method m = c.getMethod("RegistTest", Socket.class, String.class, String.class);
						m.invoke(obj, socket, userName, pwd);
					}
				} else {
					String[] str5 = action.split("[?]");
					String action3 = str5[0];
					String[] str6 = str5[1].split("=");

					String fileName = str6[1];// 下载文件时文件名
					System.out.println("下载的文件名：" + fileName);
					fileName = new String(fileName.getBytes("ISO-8859-1"), "GBK");// 将前者编码转换为后者编码方式

					if ("download.action".equals(action3)) {
						className = pro.getProperty(action3);
						System.out.println(className);
						Class<?> c = Class.forName(className);
						Object obj = c.getConstructor().newInstance();
						Method m = c.getMethod("DownLoadTest", Socket.class, String.class);
						m.invoke(obj, socket, fileName);
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
