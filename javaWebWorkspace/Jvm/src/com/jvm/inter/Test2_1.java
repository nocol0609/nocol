package com.jvm.inter;

/**
 * ��ĳ�ʼ��ʱ��
 * @author Nocol
 *
 */
class FinalTest {
	
	public static final int x=6/2;  //xΪ����ʱ�ĳ���,�ڷ��ʳ���xʱʱ  ���� ������ĳ�ʼ��
	
	static{
		System.out.println("finalTeat static block");
	}
	
}

public class Test2_1{
	public static void main(String[] args) {
		
		System.out.println(FinalTest.x);
		
	}
}