package com.test_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 写Copy类
        要求：将1个文件的内容同时复制到多个文件
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		File srcFile = new File("src.txt");
		File f1 = new File("1.txt");
		File f2 = new File("2.txt");
		File f3 = new File("3.txt");
		CopyFile(srcFile, f1);
		CopyFile(srcFile, f2);
		CopyFile(srcFile, f3);
	}

	private static void CopyFile(File srcFile, File f) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
