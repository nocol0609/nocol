package com.reflect_propertiy;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �����������ļ���Ӧ��
 */
public class PropertyDemo {
	public static void main(String[] args) throws Exception {
//		//����ǰ������
//		Student s=new Student();
//		s.love();
//		
//		Teacher t=new Teacher();
//		t.love();
//		
//		System.out.println("--------------");
//		
		//����������������Ҫÿ�ζ�������������ֱ���������ļ����޸�Ҫ�õ�������Ҫ���ķ������ɣ�
		Properties prop=new Properties();
		FileReader file=new FileReader("property.txt");
		//���������ļ�
		prop.load(file); 
		file.close();
		
		//��ȡ����
		String className=prop.getProperty("className");
		String methodName=prop.getProperty("methodName");
		
		//��ȡclass�ļ�����
		Class c=Class.forName(className);
		//ͨ��class�ļ������ȡ�����
		Constructor con=c.getConstructor();
		Object obj=con.newInstance();
		//��ȡ����
		Method m1=c.getMethod(methodName);
		m1.invoke(obj);//�޲�
		
	}
}
