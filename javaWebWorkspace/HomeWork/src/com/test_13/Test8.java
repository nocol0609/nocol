package com.test_13;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {

		String FileName = null;
		Scanner sc = null;
		BufferedWriter bw = null;
		String file=null;//文件内容
		try {
			sc = new Scanner(new FileInputStream("abc.txt"));
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				// System.out.println(string);
				if (str.indexOf("Content-Disposition:") != -1) {
					System.out.println(str);
					String[] str1 = str.split(";");
					String FilePath = str1[2];
					FileName = FilePath.substring(11, FilePath.length() - 1);
					System.out.println(FileName);
				} else if (str.indexOf("Content-Type: text/plain") != -1) {
					String str2 = sc.nextLine();
					System.out.println("这是str2:空行" + str2);// 空行
					
					bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileName)));
					
					while (sc.hasNextLine()) {
						file = sc.nextLine();
						// System.out.println(file);//包括最后一行的文件内容
						if (file.indexOf("-----------------------------") != -1) {
							break;
						}
						//System.out.println(file);
						bw.write(file);
						bw.newLine();
						bw.flush();
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
