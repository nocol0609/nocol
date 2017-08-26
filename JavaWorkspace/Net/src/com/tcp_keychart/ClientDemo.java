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
 * 客户端键盘录入，服务器输出到控制台
 */
public class ClientDemo {
	public static void main(String[] args)throws IOException {
		//创键客户端Soket对象
		Socket s=new Socket("192.168.179.2",6768); 
		
		//将通道内的流包装一下，键盘录入数据后发数据是用通道内的流，因此发送键盘录入的字符流需要将通道内字节流包装（通过转换流）
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	
		//键盘录入数据
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		String line=null;
		while((line=br.readLine())!=null){
			//键盘录入自定义结束标志
			if("886".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		s.close();
	}
}
