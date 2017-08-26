package com.test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("random", "rw");
		System.out.println(raf.getFilePointer());
		//System.out.println(raf.length());
		raf.setLength(100);
		raf.write("hello".getBytes());
		System.out.println(raf.length());
		System.out.println(raf.getFilePointer());//5
		//raf.seek(0);
		raf.skipBytes(10);//从开始字符串末尾开始跳指定数字开始写入
		raf.write("filePoint".getBytes());
		raf.close();
	}
}
