package com.copyfile_ch;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ��룬���ԣ�����ָ�����롣
 * ��ת�����������е㳤�����ԣ�Java���ṩ�������๩����ʹ�á�
 * OutputStreamWriter = FileOutputStream + �����(GBK)
 * FileWriter = FileOutputStream + �����(GBK)
 * 
 * InputStreamReader = FileInputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 * 
 /*
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * 
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader
 * Ŀ�ĵأ�
 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileReader fr1=new FileReader("copy.txt");
		FileWriter fw1=new FileWriter("fw1.txt");
//		//��һ�ַ�ʽ��һ�ζ�һ���ַ�
//		int ch=0;
//		while((ch=fr1.read())!=-1){
//			fw1.write(ch);
//		}
		//�ڶ��ַ�ʽ��һ�ζ�һ���ַ�����
		char[] chs=new char[1024];
		int len=0;
		while((len=fr1.read(chs))!=-1){
			fw1.write(chs,0,len);
		}
		fr1.close();
		fw1.close();
	}
}
