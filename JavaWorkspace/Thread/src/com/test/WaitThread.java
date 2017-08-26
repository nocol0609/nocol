package com.test;

class ResultSet {

	private int value;
    private boolean flag;//Ĭ��false
    
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}

// ������
class CaculateThread extends Thread {

	private ResultSet rs;
	public CaculateThread(ResultSet rs) {
		// TODO Auto-generated constructor stub
		this.rs = rs;
	}

	@Override
	public void run() { 
		// TODO Auto-generated method stub
		int sum = 0; 
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		rs.setValue(sum);
		
		while(!rs.isFlag()){//�ж��Ƿ����̵߳ȴ�
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	
		// ֪ͨ�ȴ��߳̿��������� //rs.notifyAll();
		synchronized (rs) {
			rs.notify();
		}

	}
}

// ȡ����
class PrintThread extends Thread {

	private ResultSet rs;
	public PrintThread(ResultSet rs) {
		// TODO Auto-generated constructor stub
		this.rs = rs;
	}

	@Override
	public void run() {
		// �ȴ�״̬
		try {
			// ���ж����ӡ�̶߳���Ҫ����wait()����
			synchronized (rs) {
				rs.setFlag(true);//��ʾ���߳��ڵȴ���
				rs.wait();//����ȴ�
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int value = rs.getValue();
		System.out.println("1--100֮���������ĺ�Ϊ��" + value);
	}
}

public class WaitThread {
	public static void main(String[] args) {

		ResultSet rs = new ResultSet();
		CaculateThread ct = new CaculateThread(rs);
		PrintThread pt = new PrintThread(rs);

		ct.start();
		pt.start();

	}
}
