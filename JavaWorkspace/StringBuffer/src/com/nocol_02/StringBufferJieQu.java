package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
 * public String substring(int start)    //从截取处到末尾
 * public String substring(int start,int end) //从指定位置截取到指定位置结束
 */
public class StringBufferJieQu {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 添加元素
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// 截取功能
		// public String substring(int start)
		String s = sb.substring(5);
		System.out.println("s:" + s);//worldjava
		System.out.println("sb:" + sb);//sb:helloworldjava,截取后本身不会改变

		// public String substring(int start,int end)
		//需求：将world截取出来
		String ss = sb.substring(5, 10);
		System.out.println("ss:" + ss);//ss:world
		System.out.println("sb:" + sb);//sb:helloworldjava
	}
}
