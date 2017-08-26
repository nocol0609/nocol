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
		raf.writeBoolean(true);//1个字节
		raf.writeInt(10);//4个字节
		raf.writeDouble(Math.random());//8个字节
		raf.writeUTF("hello");
		raf.writeChar('a');
		raf.seek(0);
		
		System.out.println(raf.readBoolean());
		
		//跳过int和Double直接读Char
		raf.skipBytes(12);
		//跳过字符串
		raf.skipBytes(raf.readShort());
		
		//System.out.println(raf.readInt());
		//System.out.println(raf.readDouble());
		System.out.println(raf.readChar());
		raf.close();
	}
}
