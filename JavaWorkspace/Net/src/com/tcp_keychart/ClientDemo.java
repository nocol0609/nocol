package com.tcp_keychart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �ͻ��˼���¼�룬���������������̨
 */
public class ClientDemo {
	public static void main(String[] args)throws IOException {
		//�����ͻ���Soket����
		Socket s=new Socket("192.168.179.2",6768); 
		
		//��ͨ���ڵ�����װһ�£�����¼�����ݺ���������ͨ���ڵ�������˷��ͼ���¼����ַ�����Ҫ��ͨ�����ֽ�����װ��ͨ��ת������
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	
		//����¼������
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		String line=null;
		while((line=br.readLine())!=null){
			//����¼���Զ��������־
			if("886".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		s.close();
	}
}
