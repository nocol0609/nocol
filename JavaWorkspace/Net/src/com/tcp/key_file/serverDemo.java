package com.tcp.key_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
public class serverDemo {
	public static void main(String[] args)throws IOException {
		//����������Socket����
		ServerSocket ss=new ServerSocket(4546);
		//�����ͻ�������
		Socket s=ss.accept();
		//��װͨ����
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��װ�ı�����Ŀ¼
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
		
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		bw.close();
		s.close();
	}
}
