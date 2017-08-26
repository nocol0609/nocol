package com.nocol_01;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 校验qq号码（通常写法）：
 * 		1:要求必须是5-15位数字
 * 		2:0不能开头
 * 
 * 分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ:"+checkQQ(qq));
	}

	/**
	 * 写一个功能实现校验 两个明确： 
	 *   	明确返回值类型：boolean 
	 *   	明确参数列表：String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;

		// 校验长度
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				// 必须是数字
				char[] chs = qq.toCharArray();  //将字符串转换成字符数组
				for (int x = 0; x < chs.length; x++) { //遍历字符数组并拿到每个字符
					char ch = chs[x];
					if (!Character.isDigit(ch)) {  //判断是否为数字
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}
}