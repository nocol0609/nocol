package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 *	���̣�
 *		�������еĳ�����ϵͳ������Դ����͵��õĶ�����λ��
 *		ÿһ�����̶������Լ����ڴ�ռ��ϵͳ��Դ��
 *	�̣߳�
 *		�ǽ����еĵ���˳�����������һ��ִ��·��
 *		һ���������ֻ��һ��ִ��·�������Ϊ���̳߳���
 *		һ����������ж���ִ��·�������Ϊ���̳߳���
 *  ������
 *  	ɨ�׳���Ѹ������
 *  
 *  ���ע�������ʻ�����𣺲��кͲ�����
 *		ǰ�����߼���ͬʱ������ָ��ĳһ��ʱ����ͬʱ���ж������
 *		������������ͬʱ������ָ��ĳһ��ʱ���ͬʱ���ж������
 *
 * Java���������ԭ��
 * 		��java��������JVM��JVM�������൱��������һ�����̡�
 * 		�����иý��̴�����һ�����߳�ȥ����main������
 * 
 * ˼���⣺
 * 		jvm������������ǵ��̵߳Ļ��Ƕ��̵߳�?
 * 			���̵߳ġ�
 * 			ԭ�������������߳�ҲҪ����������������׻�����ڴ������
 * 			���ڵ����������̼߳���ǰ������̣߳���������������̣߳����ԣ�jvm��������ʵ�Ƕ��̵߳ġ�
 */
class MyTread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<101;i++){
			System.out.println(getName()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyTread my1=new MyTread();
//		MyTread my2=new MyTread();
		
		my1.setName("�߳�1---");
//		my2.setName("�߳�2---");
		
//		my1.setPriority(10);
//		my2.setPriority(1);
		
		my1.start();
//		my2.start();
		
//		Thread thread=Thread.currentThread();
//		thread.getName();
//		System.out.println(thread);
		
	}
}
