package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * дһ������,��������һ��String���͵Ķ������տ��԰�����ַ��������г��ֹ���ÿһ����ĸ��ӡ����
����:  "wwqweqdasdafdsfdsferer"
�����������������������ӡ: w q e d a s f r    
 
         ��֮ǰ��ҵ�Ļ�����,����Ҫ������ֹ����ַ���Ҫ���ÿ���ַ������˶��ٴ�
 */
public class String_Collection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String line = sc.nextLine();
		sc.close();
		// ��ӡ��ĸ
		System.out.println("��ӡ��ĸ��");
		print(line);
	}

	private static void print(String line) {

		List<String> list = new ArrayList<String>();
		
		// TODO Auto-generated method stub
		char[] chs = line.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			list.add(Character.toString(chs[i]));
		}

		// �����¼���ȥ��
		List<String> newList = new ArrayList<>();
		for (String string : list) {
			if (!newList.contains(string)) {
				newList.add(string);
			}
		}
		
		for(int i=0;i<newList.size();i++){
				int count=0;
			for(int j=0;j<list.size();j++){
				if(newList.get(i).equals(list.get(j))){
					count++;
				}
			}
			System.out.println(newList.get(i)+"������"+count+"��");
		}
		
//		for (String string : newList) {
//			System.out.println("�ַ�"+string+"������"+count+"��");
//		}
			
	}
}
