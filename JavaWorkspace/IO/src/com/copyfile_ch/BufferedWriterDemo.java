package com.copyfile_ch;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ���������
 * BufferedWriter:�ַ����������
 * BufferedReader:�ַ�����������
 * 
 * BufferedWriter:�ַ����������
 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * ����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ� 
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		// BufferedWriter(Writer out)
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.tex")));
		//��д
		BufferedWriter bW=new BufferedWriter(new FileWriter("bw.txt"));
		
		bW.write("hello");
		bW.write("world");
		bW.write("java");
		
		bW.flush();
		bW.close(); 
	}
}
