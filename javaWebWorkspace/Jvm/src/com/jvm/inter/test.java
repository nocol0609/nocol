package com.jvm.inter;

/**
 * ��ĳ�ʼ��ʱ����
 * 
 * 		ֻ�е�������ʵľ�̬������̬����ȷʵ�ڵ�ǰ����ߵ�ǰ�ӿ��ж���ʱ��
 * �ſ�����Ϊ�Ƕ����ӿڵ�����ʹ��
 * 
 * @author Nocol
 *
 */

class parent{
	
	static int a=3;   //��̬���������ڸ���
	
	static{
		System.out.println("parent static block");
	}
	
	static void doSomething(){
		System.out.println("do something");
	}
}

class child extends parent{
	
	static{
		System.out.println("child static block");
	}
	
}

public class test {
	public static void main(String[] args) {
		
		System.out.println(child.a);
		
		child.doSomething();
		
		/*
			�������̬����a�;�̬���������Ƕ����ڵ�ǰchild���У����Բ����child���г�ʼ��
			
			parent static block
			3
			do something		 
		 */
		
	}
}
