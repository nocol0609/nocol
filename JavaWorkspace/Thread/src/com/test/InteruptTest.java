package com.test;

public class InteruptTest extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			/*System.out.println("1�Ƿ��жϣ�"+isInterrupted()); //true   ����ִ�к󱣳�״̬
			System.out.println("2�Ƿ��жϣ�"+isInterrupted());*/ //true
			
			System.out.println("1�Ƿ��жϣ�"+interrupted());// true������ִ�к����״̬
			System.out.println("2�Ƿ��жϣ�"+interrupted());//false
			
			Thread.sleep(1000);
			System.out.println("�߳�sleep()����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�̱߳��жϣ���ǰ���߳�״̬��"+isInterrupted());
		}
	}
	public static void main(String[] args) {
		InteruptTest it=new InteruptTest();
		it.start();
		it.interrupt();
	}
}