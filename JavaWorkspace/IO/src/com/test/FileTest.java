package com.test;

import java.io.File;
import java.io.FileInputStream;

public class FileTest {
	public static void main(String[] args) throws Exception {
//		File file=new File("i:\\e");
//		System.out.println("文件是否存在："+file.exists());
//		System.out.println("是不是文件："+file.isFile());
//		System.out.println("是不是文件夹："+file.isDirectory());
//		System.out.println("是不是绝对路径："+file.isAbsolute());
		FileInputStream fin = new FileInputStream("one.txt");
		System.out.println((char)fin.read() );
		fin.close();
	}
}
