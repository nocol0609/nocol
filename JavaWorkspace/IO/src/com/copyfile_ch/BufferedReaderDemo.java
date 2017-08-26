package com.copyfile_ch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * BufferedReader
 * 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 
 * 可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了。 
 * 
 * BufferedReader(Reader in)
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("copy.txt"));
//		//第一种
//		int ch;
//		while((ch=br.read())!=-1){
//			System.out.print((char)ch);
//		}
		//第二种
		char[] chs=new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			System.out.println(new String(chs,0,len));//将字符数组转换成字符串
			
		}
		br.close();
	}
}
