package com.reflect_test;

import java.lang.reflect.Field;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 *  �˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue
 */
public class Tool {
	public void setProperty(Object obj, String propertyName, Object value) throws Exception{
		//��ȡclass�ļ�����
		Class c=obj.getClass();
		
		//ͨ��class�ļ������ȡ��Ա��������
		Field field=c.getDeclaredField(propertyName);//��ֹ�ó�Ա�ֶ�Ϊ˽��
		field.setAccessible(true);
		// ������ĳ�Ա������ֵΪָ����ֵ
		field.set(obj, value); 
	}
}
