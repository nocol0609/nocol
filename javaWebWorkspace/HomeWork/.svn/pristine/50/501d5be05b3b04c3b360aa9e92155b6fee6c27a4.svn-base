package com.test_10;

public class getStorage implements Runnable {

	private Storage s;

	public getStorage(Storage s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (s) {
			if (!s.flag) {
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("获取的数据是：" + Storage.num);

			s.flag = false;
			s.notify();
		}

	}
}
