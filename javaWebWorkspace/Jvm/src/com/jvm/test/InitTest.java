package com.jvm.test;

class superClass {
	static {
		System.out.println("this superClass!");
	}

	public static int value = 123;

}

class childClass extends superClass {

	static {
		System.out.println("this chilClass!");
	}
}

public class InitTest {
	public static void main(String[] args) {
		//��������ʵ��һ��������ʵľ�̬�����ڸ����ж���ģ���˲��ᴥ������ĳ�ʼ��
		System.out.println(childClass.value);
		
		//this superClass!
		//123
		
		System.out.println("----------------");
		
		//��������ʵ����������ӡ
		superClass[] superClasses=new superClass[10];
			
		
		
		
	}
}
