package com.nocol.send;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Properties;

import com.nocol.bean.BIDR;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * InputStream is=s.getInputStream; ObjectInputStream ois=new
 * ObjectInputStream(is); ois.readObject;
 * 
 * 
 */
public class ServerImpl implements WossModuleInit {

	private int port;
	private static ConfigurationImpl con;

	static {
		con = new ConfigurationImpl();
	}

	@Override
	public void init(Properties properties) {
		// TODO Auto-generated method stub
		port = Integer.parseInt(properties.getProperty("port"));
	}

	public void revice() throws Exception {
		System.out.println("等待客户端连接...");
		// 创建Socket对象
		ServerSocket socket = new ServerSocket(port);
		// 监听客户端
		Socket s = socket.accept();
		System.out.println("服务器接收客户端连接，准备接收数据...");
		InputStream is = s.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		List<BIDR> list = (List<BIDR>) ois.readObject();
		System.out.println("服务器数据接收完毕，准备入库...");
//		for (BIDR b : list) {
//			System.out.println(b);
//		}
		con.getDbStore().dbstore(list);
	}

	public static void main(String[] args) throws Exception {
		ServerImpl server = con.getServer();
		server.revice();
	}
}
