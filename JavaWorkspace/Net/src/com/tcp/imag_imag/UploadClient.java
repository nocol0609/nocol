package com.tcp.imag_imag;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ������ͼƬ�ϴ����������������ٽ�ͼƬд�뱾��ͼƬ
 */
public class UploadClient {
	public static void main(String[] args) throws IOException{
		//�����ͻ���Socket����
		Socket s=new Socket("192.168.56.1",10086);
		//��װͨ����
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		//��װ����Դ�ļ�Ŀ¼
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("touxiang.jpg"));
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys, 0, len);
			bos.flush();
		}
		//���β��
		s.shutdownOutput();
		
		//��ȡ��������ȡ����
		InputStream is=s.getInputStream();
		byte[] bys2=new byte[1024];
		int len2=0;
		while((len2=is.read(bys2))!=-1){
			System.out.println(new String(bys2,0,len2));
		}
		//�ͷ���Դ
		bis.close();
		s.close();
	}
}
