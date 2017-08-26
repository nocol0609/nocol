package com.test_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 要求（第一部分）
实现文件复制功能
1、读写文件通过FileReader和FileWriter进行
2、使用BufferedReader和PrintWriter对FileReader和FileWriter进行过滤/封装
3、使用readLine()和println()完成复制操作的读写功能
注意：如果读到文件尾，readLine()返回null

要求(第二部分)
1、使用File对象描述文件
2、源文件要求必须已经存在，否则输出相应的信息并结束程序
3、目标文件要求允许写入，否则输出相应信息并结束程序
 */
public class Test4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("src.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src1.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
		}
		br.close();
		bw.close();
	}
}
