package com.file_arraylist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			ArrayList������洢�����ַ�����
 * 			����ArrayList���ϣ������ݻ�ȡ����
 * 			Ȼ��洢���ı��ļ��С�
 * 			�ı��ļ�˵��ʹ���ַ�����
 * 
 * ����Դ��
 * 		ArrayList<String> -- �����õ�ÿһ���ַ�������
 * Ŀ�ĵأ�
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFile {
	public static void main(String[] args) throws IOException{
		//��������Դ
		ArrayList<String> array=new ArrayList<String>(); 
		//��װĿ�ĵ�
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt")); 
		//�������
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//��������
		for(String s:array){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
