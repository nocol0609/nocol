package com.copyfile_ch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * BufferedReader
 * ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ�� 
 * ����ָ���������Ĵ�С�����߿�ʹ��Ĭ�ϵĴ�С�����������£�Ĭ��ֵ���㹻���ˡ� 
 * 
 * BufferedReader(Reader in)
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("copy.txt"));
//		//��һ��
//		int ch;
//		while((ch=br.read())!=-1){
//			System.out.print((char)ch);
//		}
		//�ڶ���
		char[] chs=new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			System.out.println(new String(chs,0,len));//���ַ�����ת�����ַ���
			
		}
		br.close();
	}
}
