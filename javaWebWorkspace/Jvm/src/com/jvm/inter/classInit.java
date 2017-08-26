package com.jvm.inter;

/**
 * ��ĳ�ʼ��ʱ����
 * 		����classLoader���loadClass��������һ���࣬�����Ƕ����
 * ����ʹ�ã����ᵼ����ĳ�ʼ�����������������֮һ��
 * 
 *      ��ʹ�÷��䣺Class.forName("com.jvm.inter.classLoder") ��ᵼ�¶���ĳ�ʼ��
 * 	
 * @author Nocol
 *
 */

class classLoder{
	
	static{
		System.out.println("class classloder");
	}
}

public class classInit {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//��ȡϵͳ�������
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		 
		//�����ࣨ�����ʼ�����ص��ࣩ
		Class<?> clazz = loader.loadClass("com.jvm.inter.classLoder");
		
		System.out.println("---------------------------");
		
		clazz=Class.forName("com.jvm.inter.classLoder");
	}
}
