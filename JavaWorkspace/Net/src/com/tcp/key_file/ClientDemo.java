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
 * 客户端键盘录入，服务器输出文本文件
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException{
		//创建客户端Socket对象
		Socket s=new Socket("192.168.56.1",4546);
		//封装通道流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//键盘录入数据
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=br.readLine())!=null){
			//键盘录入时自定义结束标志
			if("over".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		br.close();
		s.close();
	}
}
