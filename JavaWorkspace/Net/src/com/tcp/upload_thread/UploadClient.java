package com.tcp.upload_thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �����ϴ��ļ������̸߳Ľ�����Դ�����߿�����������Դ�������������
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		//�����ͻ���Socket����
		Socket s=new Socket("192.168.56.1", 4546); 
		//��װͨ����
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//��װ����Դ�ļ�Ŀ¼
		BufferedReader br=new BufferedReader(new FileReader("JDBCTemplate.java"));
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//������־
		s.shutdownOutput();
		//��ȡ��ȡ������������
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len=0;
		while((len=is.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}
		//�ͷ���Դ
		br.close();
		s.close();
	}
}
