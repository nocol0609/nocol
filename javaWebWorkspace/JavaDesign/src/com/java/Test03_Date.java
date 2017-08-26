package com.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 题目：编写程序计算两个时间相差的天数
 */
public class Test03_Date {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
		String currDate = sdf.format(date);
		System.out.println("当前时间:"+currDate);
	}
}
  