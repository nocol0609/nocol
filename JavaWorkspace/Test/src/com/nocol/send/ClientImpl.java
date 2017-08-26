package com.nocol.send;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
// 发送
/*
 * Socket s = new Socket("192.168.56.1", 4546); OutPutStream
 * os=s.getOutputStream(); ObjectoutputStream oos=new ObjectOutputStream(os);
 * List<BIDR> list=(List<BIDR>)new Gather().gather("radwtmp_test");
 * oos.writeObject(list); oos.flush;
 * 
 */
public class ClientImpl implements WossModuleInit {

	private  String ip;
	private  int port;
	private static ConfigurationImpl con;
	
	static{
		con=new ConfigurationImpl();
	}

	@Override
	public void init(Properties properties) {
		// TODO Auto-generated method stub
		ip = properties.getProperty("ip");
		port = Integer.parseInt(properties.getProperty("port"));
	}

	public  void send() throws Exception {
		System.out.println("客户端正在与服务器建立连接...");
		// 创建发送Socket对象
		Socket socket = new Socket(ip, port);
		System.out.println("连接成功，准备发送数据...");

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		List<BIDR> list = (List<BIDR>) con.getGather().gather();
		oos.writeObject(list);
		System.out.println("客户端发送数据完成");
		oos.flush();
	}

	public static void main(String[] args) throws Exception {
		ClientImpl client = con.getClient();
		client.send();
	}

}
