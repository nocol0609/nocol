package com.nocol_03;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ʵ��Runnable�ӿڵķ�ʽʵ������������ͬʱ��Ʊ
 */
/*
 * ��ν���̰߳�ȫ������?
 * 
 * Ҫ�������⣬��Ҫ֪����Щԭ��ᵼ�³�����:(������Щԭ��Ҳ���Ժ������ж�һ�������Ƿ�����̰߳�ȫ����ı�׼)
 * A:�Ƿ��Ƕ��̻߳���
 * B:�Ƿ��й�������
 * C:�Ƿ��ж�����������������
 * 
 * ����������һ�����ǵĳ�����û�������������?
 * A:�Ƿ��Ƕ��̻߳���	��
 * B:�Ƿ��й�������	��
 * C:�Ƿ��ж�����������������	��
 * 
 * �ɴ˿ɼ����ǵĳ�����������������ģ���Ϊ������������������
 * ��������������Ҫ������ν��������?
 * A��B���������Ǹı䲻�ˣ�����ֻ����취ȥ��C�ı�һ�¡�
 * ˼�룺
 * 		�Ѷ����������������ݵĴ��������һ�����壬��ĳ���߳���ִ�е�ʱ�򣬱��˲�����ִ�С�
 * ���������ǲ�֪����ô����?��ʵ��Ҳ��֪��������Java�������ṩ�ˣ�ͬ�����ơ�
 * 
 * ͬ������飺
 * 		synchronized(����){
 * 			��Ҫͬ���Ĵ���;
 * 		}
 * 
 * 		A:������ʲô��?
 * 			�������
 * 		B:��Ҫͬ���Ĵ�������Щ��?
 * 			�Ѷ����������������ݵĴ���Ĳ��ָ�������
 * 
 * 		ע�⣺
 * 			ͬ�����Խ����ȫ����ĸ���ԭ������Ǹ������ϡ��ö�����ͬ���Ĺ��ܡ�
 * 			����̱߳�����ͬһ������
 * ͬ�����ص㣺
 * 		ǰ�᣺
 * 			����߳�
 *		��������ʱ��Ҫע�⣺
 *			����߳�ʹ�õ���ͬһ��������
 * ͬ���ĺô���
 *		ͬ���ĳ��ֽ���˶��̵߳İ�ȫ���⡣
 * ͬ���ı׶ˣ�
 *		���߳��൱��ʱ����Ϊÿ���̶߳���ȥ�ж�ͬ���ϵ��������Ǻܺķ���Դ�ģ������лή�ͳ��������Ч��
 */
class MyRunnable implements Runnable {
	// ����Ʊ��
	private int tickets = 100;
	//����������
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class SellTicketsDemo {
	public static void main(String[] args) {
		// ����MyRunnable����
		MyRunnable my = new MyRunnable();
		// ����Thread�̶߳���
		Thread th1 = new Thread(my);
		Thread th2 = new Thread(my);
		Thread th3 = new Thread(my);

		// ��Thread�̶߳���setName
		th1.setName("����1");
		th2.setName("����2");
		th3.setName("����3");

		// �����߳�
		th1.start();
		th2.start();
		th3.start();
	}
}
