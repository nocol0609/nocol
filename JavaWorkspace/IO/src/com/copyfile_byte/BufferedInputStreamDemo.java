package com.copyfile_byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * // BufferedInputStream(InputStream in)
 * 
 * 注意：虽然我们有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个。
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
	//	FileInputStream fis=new FileInputStream("copy.txt");
	//  BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("copy.txt"));
//	    //第一种读取方式，一次读一个字节
//		int by=0;
//		while((by=bis.read())!=-1){
//			System.out.print((char)by);
//		}
		
	    //第二种读取方式，一次读一个字节数组
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));//将字节数组转换成字符串
		}
		//释放资源
	    bis.close();
	}
}
