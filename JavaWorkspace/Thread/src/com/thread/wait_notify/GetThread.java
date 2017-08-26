package com.thread.wait_notify;

public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if(!s.flag){//��Ϊfalse��ʾ��û�����ݣ�����û��setName
					try {
						s.wait(); //t2�͵ȴ��ˡ������ͷ����������ѹ�����ʱ���Ǵ������ѹ�����ʱ��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name + "---" + s.age);
					
				//�޸ı��
				s.flag = false;
				//�����߳�
				s.notify(); //����t1
			}
		}
	}
}
