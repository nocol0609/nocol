package com.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��Ŀ����д�����������ʱ����������
 */
public class Test03_Date {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
		String currDate = sdf.format(date);
		System.out.println("��ǰʱ��:"+currDate);
	}
}
  