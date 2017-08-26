package com.copyfile_byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 复制文本文件：一次读取一个字节数组
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws Exception {
		//封装数据源
		FileInputStream fis=new FileInputStream("copy.txt");
		//FileInputStream fis = new FileInputStream("e:\\林青霞.jpg");//复制图片
		//FileInputStream fis = new FileInputStream("e:\\Mylove.mp4");//复制音频
		FileOutputStream fos=new FileOutputStream("copy2.txt");
		//FileOutputStream fos = new FileOutputStream("mn.jpg");/在当前目录下生成
		//FileOutputStream fos = new FileOutputStream("mn.mp4");/在当前目录下生成
		//复制数据
		byte[] bys=new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1){
			fos.write(bys,0,len);
		}
		//释放资源
		fos.close();
		fis.close();
	}
}
