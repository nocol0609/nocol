package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * public final void setDaemon(boolean on):�����̱߳��Ϊ�ػ��̻߳��û��̡߳�
 * ���������е��̶߳����ػ��߳�ʱ��Java ������˳��� 
 * 
 * �÷��������������߳�ǰ���á� 
 * 
 * ��Ϸ��̹�˴�ս��
 */
class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
		}
	}
}
public class Thread_Daemon {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();

		td1.setName("����");
		td2.setName("�ŷ�");

		// �����ػ��߳�  ���������߳�ǰ���á�
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		Thread.currentThread().setName("����");//��main����ȡ��Ϊ����
		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}
}

