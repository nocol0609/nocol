package com.nocol.io;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class RandomTest {
	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile(new File("test.txt"), "rw");		
		raf.writeBoolean(true);//1���ֽ�
		raf.writeInt(10);//4���ֽ�
		raf.writeDouble(Math.random());//8���ֽ�
		raf.writeUTF("hello");
		raf.writeChar('a');
		raf.seek(0);
		
		System.out.println(raf.readBoolean());
		
		//����int��Doubleֱ�Ӷ�Char
		raf.skipBytes(12);
		//�����ַ���
		raf.skipBytes(raf.readShort());
		
		//System.out.println(raf.readInt());
		//System.out.println(raf.readDouble());
		System.out.println(raf.readChar());
		raf.close();
	}
}