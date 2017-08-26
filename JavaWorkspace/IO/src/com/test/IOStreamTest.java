package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreamTest {
	public static void input() {
		try {
			FileInputStream fis=new FileInputStream("one.txt");
			int len=0;
		    byte[] bys=new byte[1024];
			while((len=fis.read(bys))!=-1){
				System.out.println(new String(bys,0,len));
				//System.out.println((char)len);
			}
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 将信息输出文件
	public static void output() {
		try {
			 
			FileOutputStream fos = new FileOutputStream("one.txt");
			fos.write("哈哈哈".getBytes());
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//output();
		input();
	}
}
