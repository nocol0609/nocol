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
 * ע�⣺��Ȼ���������ַ�ʽ���Զ�ȡ�����ǣ���ע�⣬�����ַ�ʽ���ͬһ��������һ��������ֻ��ʹ��һ����
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
	//	FileInputStream fis=new FileInputStream("copy.txt");
	//  BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("copy.txt"));
//	    //��һ�ֶ�ȡ��ʽ��һ�ζ�һ���ֽ�
//		int by=0;
//		while((by=bis.read())!=-1){
//			System.out.print((char)by);
//		}
		
	    //�ڶ��ֶ�ȡ��ʽ��һ�ζ�һ���ֽ�����
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));//���ֽ�����ת�����ַ���
		}
		//�ͷ���Դ
	    bis.close();
	}
}
