package com.tcp.upload_thread;


import java.io.IOException;
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
		//创建服务器Socket 对象
		ServerSocket ss=new ServerSocket(4546);
		
		while(true){  //任意上传者经过这会挣抢CPU（如宽带高且上传文件小的线程会优先拿到CPU执行权）
			//监听客户端连接
			Socket s=ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
