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
 * �����ı��ļ���һ�ζ�ȡһ���ֽ�����
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws Exception {
		//��װ����Դ
		FileInputStream fis=new FileInputStream("copy.txt");
		//FileInputStream fis = new FileInputStream("e:\\����ϼ.jpg");//����ͼƬ
		//FileInputStream fis = new FileInputStream("e:\\Mylove.mp4");//������Ƶ
		FileOutputStream fos=new FileOutputStream("copy2.txt");
		//FileOutputStream fos = new FileOutputStream("mn.jpg");/�ڵ�ǰĿ¼������
		//FileOutputStream fos = new FileOutputStream("mn.mp4");/�ڵ�ǰĿ¼������
		//��������
		byte[] bys=new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1){
			fos.write(bys,0,len);
		}
		//�ͷ���Դ
		fos.close();
		fis.close();
	}
}
