package com.nocol.beanutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

public class MyDateConverter implements Converter {

	/**
	 * 第一个参数：要装换成的类型 
	 * 第二个参数：待转换的表单参数
	 *  返回值：转换结果
	 */
	@Override
	public Object convert(Class arg0, Object arg1) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//将表单参数转换成字符串类型
		String strDate = arg1.toString();

		try {
			// 解析字符串的文本，生成 Date
			Date date = sdf.parse(strDate);
			return date;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
