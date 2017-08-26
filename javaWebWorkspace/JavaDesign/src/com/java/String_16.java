package com.java;

/*
 * 编写一个函数将一个十六进制数的字符串参数转换成整数返回。
 */
public class String_16 {
	public static void main(String[] args) {

		// 方式一：调方法实现
		int num = Integer.parseInt("2862", 16);// 将16 进制数2862转换成10进制整数
		System.out.println("方法实现："+num);

		// 方式二：手动实现
		String str = "2862";//16进制
		int len = str.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			// 返回指定索引处的 char 值。
			char c = str.charAt(len - 1 - i);
			// 返回使用指定基数的字符 ch 的数值。
			int num2 = Character.digit(c, 16);
			sum += num2 * (1 << (4 * i));
		}
		System.out.println("手动实现："+sum); 
		
		//=====================
		System.out.println(2>>3);
	}
}
