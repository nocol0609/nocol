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
		System.out.println("�ȴ��ͻ�������...");
		// ����Socket����
		ServerSocket socket = new ServerSocket(port);
		// �����ͻ���
		Socket s = socket.accept();
		System.out.println("���������տͻ������ӣ�׼����������...");
		InputStream is = s.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		List<BIDR> list = (List<BIDR>) ois.readObject();
		System.out.println("���������ݽ�����ϣ�׼�����...");
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
