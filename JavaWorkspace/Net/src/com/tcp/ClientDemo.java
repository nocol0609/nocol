package com.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 		这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 * 
 * 连接被拒绝。TCP协议一定要先开服务器。
 * java.net.ConnectException: Connection refused: connect
 */
public class ClientDemo {
	public static void main(String[] args)throws IOException {
		//创键客户端Socket对象
		// 创建发送端的Socket对象
		// Socket(InetAddress address, int port)
		// Socket(String host, int port)
		// Socket s = new Socket(InetAddress.getByName("192.168.56.1"), 10086);
		Socket s=new Socket("192.168.56.1",10086);
		//创键输出流对象，写数据
		// public OutputStream getOutputStream()
		OutputStream os=s.getOutputStream();
		os.write("hello,tcp".getBytes());
		//释放资源
		os.close();
	}
}
