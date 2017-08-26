package com.test_10;

public class SetStorage implements Runnable {
	
	private Storage s;
	
	public SetStorage(Storage s) {
		// TODO Auto-generated constructor stub
		this.s=s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			synchronized (s) {
				if(s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
				s.flag=true;
				s.notify();			
			}

	}
}
