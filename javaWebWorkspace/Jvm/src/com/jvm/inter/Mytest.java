package com.jvm.inter;

/**
 * ��̬��Ա��ʼ�����ϵ���
 * @author Nocol
 *
 */
class Singleton {
	
	private static Singleton singleton=new Singleton();  //����new��������г�ʼ����ִ�й��췽��
	                                                     // counter1=1; counter2=1;
	public static int counter1;       //���γ�ʼ����̬��Ա����  counter1=1;����
	public static int counter2=0;     //�ٶ�counter2���г�ʼ��,��0����counter2����˴�ʱcounter2=0;
	
	private Singleton() {
		counter1++;
		counter2++;
	}
	public static Singleton getInstance(){
		return singleton;
	}
}

public class Mytest{
	public static void main(String[] args) {
		
		Singleton singleton=Singleton.getInstance();
		
		/**
		 * ��private static Singleton singleton=new Singleton(); ��������̬��Ա����counter1��counter2֮��
		 * ���Ϊ��counter1=1; counter2=1;
		 */
		
		System.out.println("counter1="+singleton.counter1); //1
		System.out.println("counter2="+singleton.counter2);  //0
		
		
		
	}
}