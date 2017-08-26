package com.nocol.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
* @author lxp
*
* @TODO 
* 
*/
public class PrintTest {
	public static void main(String[] args) throws Exception{
		File  file=new File("test.txt");
		//PrintWriter out=new PrintWriter(file);
		
		FileOutputStream fos=new FileOutputStream(file);
		PrintWriter out=new PrintWriter(fos);
		out.println(true);
		out.println(Math.random());
		out.println(10);
		int a=Integer.parseInt("abc");
		out.print("hello");
		out.flush();
	}
}
