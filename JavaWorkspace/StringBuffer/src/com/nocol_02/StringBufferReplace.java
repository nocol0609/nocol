package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer的替换功能：
 * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
 */
public class StringBufferReplace {
	public static void main(String[] args) {
		//创建字符缓冲对象
		StringBuffer sb=new StringBuffer();
		//添加数据
		sb.append("hello").append("javaSE");
		System.out.println("替换前sb:"+sb);
		//替换数据
		//sb.replace(5, 11, "javaEE");
		//System.out.println("替换后sb:"+sb);
		// 需求：把world这个数据替换为"新年快乐"
				sb.replace(5, 11, "新年快乐");//包左不包右
				System.out.println("替换后sb:" + sb);
	}
}
