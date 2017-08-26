package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer的反转功能：
 * public StringBuffer reverse()
 */
public class StringBufferReverse {
	public static void main(String[] args) {
		//创建字符缓冲区对象
		StringBuffer sb=new StringBuffer();
		//添加数据
		sb.append("abc");
		sb.reverse();
		System.out.println("sb:"+sb); //cba
	}
}
