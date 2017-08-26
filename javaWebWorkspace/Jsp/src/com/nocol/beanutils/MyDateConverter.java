package com.nocol.beanutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

public class MyDateConverter implements Converter {

	/**
	 * ��һ��������Ҫװ���ɵ����� 
	 * �ڶ�����������ת���ı�����
	 *  ����ֵ��ת�����
	 */
	@Override
	public Object convert(Class arg0, Object arg1) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//��������ת�����ַ�������
		String strDate = arg1.toString();

		try {
			// �����ַ������ı������� Date
			Date date = sdf.parse(strDate);
			return date;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
