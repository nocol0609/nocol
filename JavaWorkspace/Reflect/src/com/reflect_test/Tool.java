package com.reflect_test;

import java.lang.reflect.Field;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 *  此方法可将obj对象中名为propertyName的属性的值设置为value
 */
public class Tool {
	public void setProperty(Object obj, String propertyName, Object value) throws Exception{
		//获取class文件对象
		Class c=obj.getClass();
		
		//通过class文件对象获取成员变量对象
		Field field=c.getDeclaredField(propertyName);//防止该成员字段为私有
		field.setAccessible(true);
		// 给对象的成员变量赋值为指定的值
		field.set(obj, value); 
	}
}
