package com.nocol.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class DataTest {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("test.txt");
			get(fis);
//			 FileOutputStream fos = new FileOutputStream("test.txt");
//			 print(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ���
	public static void print(OutputStream os) throws IOException {
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeBoolean(true);
		dos.writeChar('a');
		dos.writeInt(10);
		dos.writeDouble(Math.random());
		dos.writeUTF("hello");
		dos.flush();

	}

	// ����
	public static void get(InputStream is) throws IOException {
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
	}
}