package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * public static void yield():��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * �ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ�
 */
class ThreadYield extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
			
			Thread.yield();//�������߳�����CPU��Թ�ƽ
		}
	}
}
public class Thread_Yield {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		ty1.setName("��ɵ��");
		ty2.setName("��˧��");

		ty1.start();
		ty2.start();
	}
}

