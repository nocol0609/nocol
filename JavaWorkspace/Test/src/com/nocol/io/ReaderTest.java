package com.nocol.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


/**
* @author lxp
*
* @TODO 
* 
*/
public class ReaderTest {
	public static void main(String[] args) throws Exception {
/*		//�ַ�������
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
		//�ַ������
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bb.txt")));
		//System.out.println(br.readLine());*/		
		
		BufferedReader br=new BufferedReader(new FileReader("b.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("bb.txt"));
		
		
		String line=null;
		while((line=br.readLine())!=null){
			//System.out.println(line);
			//bw.write(line+"\r");
			//bw.flush();
			bw.write(new String(line));
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		br.close();
		bw.close();
	}
}