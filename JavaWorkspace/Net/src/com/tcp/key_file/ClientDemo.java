package com.tcp.key_file;

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
 * �ͻ��˼���¼�룬����������ı��ļ�
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException{
		//�����ͻ���Socket����
		Socket s=new Socket("192.168.56.1",4546);
		//��װͨ����
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//����¼������
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=br.readLine())!=null){
			//����¼��ʱ�Զ��������־
			if("over".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		br.close();
		s.close();
	}
}
