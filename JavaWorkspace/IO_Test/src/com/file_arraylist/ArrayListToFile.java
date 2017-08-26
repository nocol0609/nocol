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
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			ArrayList集合里存储的是字符串。
 * 			遍历ArrayList集合，把数据获取到。
 * 			然后存储到文本文件中。
 * 			文本文件说明使用字符流。
 * 
 * 数据源：
 * 		ArrayList<String> -- 遍历得到每一个字符串数据
 * 目的地：
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFile {
	public static void main(String[] args) throws IOException{
		//创建数据源
		ArrayList<String> array=new ArrayList<String>(); 
		//封装目的地
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt")); 
		//添加数据
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//遍历集合
		for(String s:array){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
