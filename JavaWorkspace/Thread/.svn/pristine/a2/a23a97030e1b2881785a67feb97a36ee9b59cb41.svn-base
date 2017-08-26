package com.test;

class ResultSet {

	private int value;
    private boolean flag;//默认false
    
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

// 存数据
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
		
		while(!rs.isFlag()){//判断是否有线程等待
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	
		// 通知等待线程可以运行了 //rs.notifyAll();
		synchronized (rs) {
			rs.notify();
		}

	}
}

// 取数据
class PrintThread extends Thread {

	private ResultSet rs;
	public PrintThread(ResultSet rs) {
		// TODO Auto-generated constructor stub
		this.rs = rs;
	}

	@Override
	public void run() {
		// 等待状态
		try {
			// 若有多个打印线程都需要调用wait()方法
			synchronized (rs) {
				rs.setFlag(true);//表示有线程在等待了
				rs.wait();//进入等待
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int value = rs.getValue();
		System.out.println("1--100之间所有数的和为：" + value);
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
