package com.jvm.inter;

import java.util.Random;

/**
 * ��ĳ�ʼ��ʱ��
 * @author Nocol
 *
 */
class FinalTest2{
	
	public static final int x=new Random().nextInt(100);  //xΪ���벻ȷ���ı�����ֻ�������е�ʱ�����ȷ�����ᴥ����ĳ�ʼ����ִ�о�̬�����
	
	static{
		System.out.println("FinalTest2 satic block");
	}
	
}

public class Test2_2 {
	public static void main(String[] args) {
		System.out.println(FinalTest2.x);
	}
}
