package com.test;

import java.io.File;
import java.io.FileInputStream;

public class FileTest {
	public static void main(String[] args) throws Exception {
//		File file=new File("i:\\e");
//		System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
//		System.out.println("�ǲ����ļ���"+file.isFile());
//		System.out.println("�ǲ����ļ��У�"+file.isDirectory());
//		System.out.println("�ǲ��Ǿ���·����"+file.isAbsolute());
		FileInputStream fin = new FileInputStream("one.txt");
		System.out.println((char)fin.read() );
		fin.close();
	}
}
