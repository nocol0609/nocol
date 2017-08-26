package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 分割功能练习
 */
public class FengeTest {
	public static void main(String[] args) {
		// 定义一个字符串
		String s1 = "aa,bb,cc";
		//定义分割规则
		String regex=",";
		//定义字符串数组接收
		String[] str1Array = s1.split(regex);
		for (int x = 0; x < str1Array.length; x++) {
			System.out.println(str1Array[x]);
		}
		System.out.println("---------------------");

		String s2 = "aa.bb.cc";
		//String Regex="\\."
		//String[] str2Array=s2.split(Regex);
		String[] str2Array = s2.split("\\.");//本身"."就是用"\."表示
		for (int x = 0; x < str2Array.length; x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("---------------------");

		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +"); //空格+表示以空格为分割规则，一次或多次出现
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("---------------------");
		
		//硬盘上的路径E:\JavaSE\day14\avi，放到代码应该用\\替代\
		String s4 = "E:\\JavaSE\\day14\\avi"; //第一次转换
		String[] str4Array = s4.split("\\\\");//第二次转换
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");
	}
}
